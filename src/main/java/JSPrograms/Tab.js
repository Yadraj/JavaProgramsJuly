describe("test suit",()=>{

test("test case",()=>{

    cy.visit("");
    
    cy.window().then((win)=>{

        cy.stub(win,'open').as(openWindow);
    });

    cy.get('.button').click();

    cy.get('@openWindow').should('have.been.called');

    cy.get('@openWindow').then((stub)=>{

        const taburl = stub.firstCall.args[0];
        cy.visit(taburl);


    
})

test('',()=>{

cy.get('a').invoke('removeAttr','target').click();

})

})

});