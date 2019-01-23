const PROXY_CONFIG = [
  {
    context: [
      "/api",
      "/oauth"
    ],
    target: "http://localhost:8000",
    secure: false
  },
  {
    context: [
      "/stomp"
    ],
    target: "http://localhost:8000",
    secure: false
  }
];

module.exports = PROXY_CONFIG;
