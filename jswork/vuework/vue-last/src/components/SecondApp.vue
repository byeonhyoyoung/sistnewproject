<template>
    <div>
        <h1 class="alert alert-info">SecondApp입니다</h1>
        <h2>{{ counter }}</h2>
        <button @click="countIncre">증가</button>

        <h2>{{ message }}</h2>
        <button @click="msgIncre">생성?</button>
    </div>
</template>

<script>
import { ref } from 'vue';
export default {
    setup () {
        
        const counter=ref(0);
        const countIncre=()=>{
            counter.value++;
        }

        const message=ref("안녕 뷰 재밌냐???");
        const msgIncre=()=>{
            counter.value=message.value+"?";
        }

        return {

            counter,
            countIncre,
            message,
            msgIncre

        }
    }
}
</script>

<style lang="scss" scoped>

</style>