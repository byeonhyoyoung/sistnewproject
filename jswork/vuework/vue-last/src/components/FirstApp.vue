<template>
    <div>
        <h1 class="alert alert-info">FirstApp입니다</h1>
        <h2>반응형 메세지</h2>
        <h3>{{ reactiveMessage }}</h3>
        <button v-on:click="btnReactiveMessage">Add Message</button>


        <h2>일반 메세지</h2>
        <h3>{{ normalMessage }}</h3>
        <button @click="btnNormalMessage">Add Message</button>

    </div>
</template>

<script>
import { ref, onMounted, onBeforeMount } from 'vue';

export default {
    setup () {

        console.log("setup");

        const reactiveMessage=ref("Hello Reactive");
        const btnReactiveMessage=()=>{
            reactiveMessage.value = reactiveMessage.value + "!";
        }

        //반응형인지 검사
        // console.log(isRef(reactiveMessage));

        const normalMessage = ref('Normal Message');
        const btnNormalMessage = () => {
            normalMessage.value = normalMessage.value + "!";
        }

        onMounted(()=>{
            console.log("onMounted");
        });

        onBeforeMount(()=>{
            console.log("onBeforeMount");
        })
        

        return {

            reactiveMessage,
            normalMessage,
            btnReactiveMessage,
            btnNormalMessage
        }
    }
}
</script>

<style lang="scss" scoped>

</style>