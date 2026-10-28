const response = pm.response.json();

pm.tes("status code", function () {
  pm.response.to.have.status(200);
});

pm.test("property", function () {
  pm.expect(response).to.have.property("id");
});

pm.test("property", function () {
  pm.expect(response.name).to.eql("john");
});

pm.test("Time", function () {
  pm.expect(pm.response.responseTime).to.be.below(2000);
});

pm.test("headers", function () {
  pm.expect(pm.response.headers.get('contentType')).to.include("application/json");
});
