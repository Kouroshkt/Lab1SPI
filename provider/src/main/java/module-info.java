module org.iths.provides {
    exports org.iths.provider;

    requires org.iths.service;
    provides org.iths.service.BankLoan with org.iths.provider.SwedBank, org.iths.provider.DanskBank, org.iths.provider.Nordea, org.iths.provider.SEB;
}