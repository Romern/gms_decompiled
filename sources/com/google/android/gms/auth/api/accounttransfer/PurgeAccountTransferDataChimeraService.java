package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PurgeAccountTransferDataChimeraService extends aeah {

    /* renamed from: a */
    public static final sbw f10078a = new sbw("AccountTransfer", "PurgeATDataService");

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        f10078a.mo25371b("Running Cleanup Task");
        gvg.m13994a(this);
        synchronized (gvg.f19068b) {
            gvg.f19067a.mo25366a("AccountTransfer", "Purging account transfer database");
            deleteDatabase("auth.account_transfer.store.db");
            gvg.f19069c = null;
        }
        return 0;
    }
}
