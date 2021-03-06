<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<head>
		<meta charset="utf-8" />
		<script src="../js/echarts.js"></script>
		<title>2016年爱沙尼亚物流绩效指数</title>
	<body>
		<div id="main" style="width:100%;height:800px;display:inline-block;"></div>
		
	</body>
	<script>
	var GJ = '${GJ}';
	var WLJXZS = ${WLJXZS};
	var XM = [];
	var FS = [];
	for(i=0;i<WLJXZS.length;i++){
		XM[i]=WLJXZS[i].xm;
		FS[i]=WLJXZS[i].fs;
	}
		//开始结尾要设置容器
		var myChart = echarts.init(document.getElementById('main'));
option = {
     title: {
        text: '2016年爱沙尼亚物流绩效指数      LPI等级:38',
    	x:'center',
    	textStyle:{
            fontWeight:'bold',
            fontSize:30
        }
    },
    color: ['#3398DB'],
    tooltip : {
        trigger: 'axis',
        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        x:'center',
        containLabel: true
    },
    xAxis : [
        {
            name:'项目',
            type : 'category',
            data : XM,
            axisTick: {
                alignWithLabel: true
            }
        }
    ],
    yAxis : [
        {
            type : 'value',
            name:'分数'
        }
    ],
        label: {
                    normal: {
                        show: true,
                        position: 'top'
                    }
                },
    series : [
        {
            name:'名次',
            type:'bar',
            barWidth: '60%',
            data:FS
        }
    ]
};
myChart.setOption(option);
	</script>
</html>
