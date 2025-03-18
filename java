document.getElementById("startBtn").addEventListener("click", function() {
    document.getElementById("main").classList.add("hidden");
    document.getElementById("fullscreen").classList.remove("hidden");

    let timeLeft = 180;
    let countdownEl = document.getElementById("countdown");
    let interval = setInterval(() => {
        timeLeft--;
        countdownEl.textContent = timeLeft;
        if (timeLeft <= 0) {
            clearInterval(interval);
            document.getElementById("exitBtn").classList.remove("hidden");
        }
    }, 1000);
});

document.getElementById("exitBtn").addEventListener("click", function() {
    document.getElementById("fullscreen").classList.add("hidden");
    document.getElementById("result").classList.remove("hidden");

    const advices = [
        "今天不接陌生电话 📵",
        "今天不点开工作群 🚫",
        "今天不纠结晚上吃什么 🍽️",
        "今天不刷 LinkedIn 让自己焦虑 😌",
        "今天不内耗 🧘",
        "今天不自责 😊"
    ];
    document.getElementById("advice").textContent = advices[Math.floor(Math.random() * advices.length)];
});

document.getElementById("restartBtn").addEventListener("click", function() {
    document.getElementById("result").classList.add("hidden");
    document.getElementById("main").classList.remove("hidden");
});
