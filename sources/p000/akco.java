package p000;

import android.content.IntentFilter;
import android.provider.ContactsContract;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: akco */
final /* synthetic */ class akco implements Runnable {

    /* renamed from: a */
    private final akcv f71606a;

    public akco(akcv akcv) {
        this.f71606a = akcv;
    }

    public final void run() {
        akcv akcv = this.f71606a;
        ahhd.m55767a(akcv.f71616a, akcv.f71624i, new IntentFilter("com.google.android.gms.nearby.sharing.DEVICE_CONTACTS_CONSENT_ENABLED"));
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akcv", "g", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("ContactBookUpdater has started listening for device contacts consent.");
        try {
            akcv.f71616a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, akcv.f71625j);
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
            bnsl2.mo68432a("akcv", "g", (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("ContactBookUpdater has started listening for contact book changed events.");
        } catch (SecurityException e) {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("akcv", "g", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("ContactBookUpdater failed to listen to contact book changes.");
        }
    }
}
