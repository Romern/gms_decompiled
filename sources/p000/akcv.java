package p000;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.ContactsContract;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.nearby.sharing.provider.connections.ContactBookUpdater$1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: akcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akcv {

    /* renamed from: a */
    public final Context f71616a;

    /* renamed from: b */
    public final akbu f71617b;

    /* renamed from: c */
    public final akhb f71618c;

    /* renamed from: d */
    public final sqv f71619d;

    /* renamed from: e */
    public final ExecutorService f71620e;

    /* renamed from: f */
    public final Handler f71621f = new adzt(Looper.getMainLooper());

    /* renamed from: g */
    public final AtomicBoolean f71622g = new AtomicBoolean(false);

    /* renamed from: h */
    public boolean f71623h = false;

    /* renamed from: i */
    public final BroadcastReceiver f71624i = new ContactBookUpdater$1(this, "nearby");

    /* renamed from: j */
    public final ContentObserver f71625j = new akcu(this, "nearby", "ContactsContentObserver", this.f71621f);

    /* renamed from: k */
    private final akcl f71626k;

    /* renamed from: l */
    private final akhl f71627l;

    /* renamed from: m */
    private final ajvw f71628m;

    public akcv(Context context, akbu akbu, akhb akhb, akcl akcl, akhl akhl, ajvw ajvw, sqv sqv, ExecutorService executorService) {
        this.f71616a = context;
        this.f71617b = akbu;
        this.f71618c = akhb;
        this.f71626k = akcl;
        this.f71627l = akhl;
        this.f71628m = ajvw;
        this.f71619d = sqv;
        this.f71620e = executorService;
    }

    /* renamed from: b */
    public final void mo39231b() {
        this.f71626k.mo39212f();
        this.f71626k.mo39207d();
    }

    /* renamed from: c */
    public final void mo39233c() {
        mo39228a(new akcq(this));
    }

    /* renamed from: d */
    public final boolean mo39234d() {
        Account b = this.f71617b.mo39171b();
        if (b == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akcv", "d", 295, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Cannot upload contacts: account or account id is null.");
            return false;
        } else if (!mo39230a(b, this.f71618c.mo39436b(b))) {
            return false;
        } else {
            return this.f71627l.mo39451a(b, this.f71618c.mo39436b(b));
        }
    }

    /* renamed from: e */
    public final void mo39235e() {
        this.f71616a.getContentResolver().unregisterContentObserver(this.f71625j);
        ahhd.m55766a(this.f71616a, this.f71624i);
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akcv", "e", 411, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Stopped listening for contact book changed events.");
    }

    /* renamed from: f */
    public final SharedPreferences mo39236f() {
        return this.f71616a.getSharedPreferences("nearbysharing:provider:contacts:state", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo39237g() {
        ahhd.m55767a(this.f71616a, this.f71624i, new IntentFilter("com.google.android.gms.nearby.sharing.DEVICE_CONTACTS_CONSENT_ENABLED"));
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akcv", "g", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("ContactBookUpdater has started listening for device contacts consent.");
        try {
            this.f71616a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, this.f71625j);
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

    /* renamed from: a */
    private static boolean m59399a(ajvw ajvw, Account account) {
        try {
            return ((Boolean) aucu.m76783a(ajvw.mo38980a(account), cfov.f185185a.mo6606a().mo82349bE(), TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("akcv", "a", 374, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Cannot verify Device Contacts: got exception.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo39232b(boolean z) {
        if (cfov.f185185a.mo6606a().mo82266B() && !z && this.f71619d.mo20505a() - mo39236f().getLong("last_sync", 0) < cfov.f185185a.mo6606a().mo82267C()) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akcv", "b", 235, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Ignoring sync request for contact book because we've recently synced.");
            return;
        }
        Account b = this.f71617b.mo39171b();
        if (b == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akcv", "b", 243, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to sync contact book: account not set.");
            this.f71623h = false;
            return;
        }
        akha a = this.f71618c.mo39432a(b);
        bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl3.mo68432a("akcv", "b", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68420a("Contact book update: %s.", a);
        akha akha = akha.NO_CONTACTS_CHANGED;
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.f71623h = mo39234d();
            } else if (ordinal == 2 || ordinal == 3) {
                mo39231b();
                this.f71623h = mo39234d();
            }
        } else if (!this.f71623h) {
            this.f71623h = mo39234d();
        }
        if (this.f71623h) {
            mo39236f().edit().putLong("last_sync", this.f71619d.mo20505a()).apply();
        }
    }

    /* renamed from: a */
    public final void mo39227a() {
        mo39228a(new akcn(this));
        this.f71620e.shutdown();
        bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
        bnsl.mo68432a("akcv", "a", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("ContactBookUpdater has been shutdown.");
    }

    /* renamed from: a */
    public final void mo39228a(Runnable runnable) {
        this.f71620e.execute(runnable);
    }

    /* renamed from: a */
    public final void mo39229a(boolean z) {
        mo39228a(new akcp(this, z));
    }

    /* renamed from: a */
    public final boolean mo39230a(Account account, ajih ajih) {
        bvjy bvjy;
        Account account2 = account;
        ajih ajih2 = ajih;
        if (!m59399a(this.f71628m, account2)) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akcv", "a", 325, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Device Contacts is disabled: cannot update contacts reachability.");
            return false;
        }
        bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68390d();
        bnsl2.mo68432a("akcv", "a", 328, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Device Contacts is enabled: updating all contacts reachability.");
        sqv sqv = this.f71619d;
        ajig ajig = (ajig) ajih.f70707b.mo74144da();
        long a = sqv.mo20505a();
        bxwc bxwc = ajih2.f70709a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            ajif ajif = (ajif) bxwc.get(i);
            if (a - ajif.f70705j > cfov.f185185a.mo6606a().mo82306aO()) {
                ajig.mo38674a(ajif);
            }
        }
        ajih ajih3 = (ajih) ajig.mo74062i();
        if (ajih3.f70709a.size() <= 0) {
            return true;
        }
        akhl akhl = this.f71627l;
        if (akhl.f72004d) {
            bvjy = null;
        } else if (account2 == null || ajih3.f70709a.size() == 0 || akhl.f72002b.mo38977a(cfov.f185185a.mo6606a().mo82397u(), cfov.f185185a.mo6606a().mo82398v())) {
            bvjy = null;
        } else {
            akhl.f72002b.mo38976a();
            bvjt bvjt = (bvjt) bvjw.f156359b.mo74144da();
            bxwc bxwc2 = ajih3.f70709a;
            int size2 = bxwc2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ajif ajif2 = (ajif) bxwc2.get(i2);
                bvju bvju = (bvju) bvjv.f156354d.mo74144da();
                ajii ajii = ajif2.f70697b;
                if (ajii == null) {
                    ajii = ajii.f70710d;
                }
                String str = ajii.f70714c;
                if (bvju.f164950c) {
                    bvju.mo74035c();
                    bvju.f164950c = false;
                }
                str.getClass();
                ((bvjv) bvju.f164949b).f156356a = str;
                bvju.mo73376a(ajif2.f70700e);
                bvju.mo73377b(ajif2.f70701f);
                bvjt.mo73375a(bvju);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                akhj akhj = akhl.f72001a;
                ClientContext c = akhl.mo39456c(account2);
                bvjw bvjw = (bvjw) bvjt.mo74062i();
                if (akhj.f71994b == null) {
                    akhj.f71994b = chtv.m149566a(chtu.UNARY, "location.nearby.sharing.v1.NearbySharingService/CheckContactsReachability", ciie.m150370a(bvjw.f156359b), ciie.m150370a(bvjy.f156367b));
                }
                bvjy bvjy2 = (bvjy) akhj.f71997a.mo25553a(akhj.f71994b, c, bvjw, 10000, TimeUnit.MILLISECONDS);
                akhl.f72003c.mo38958a(ajvh.m59103a(4, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
                bvjy = bvjy2;
            } catch (chuw | gid e) {
                akhl.f72003c.mo38958a(ajvh.m59103a(4, akhl.m59710a(e), SystemClock.elapsedRealtime() - elapsedRealtime));
                bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68387b();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("akhl", "b", 558, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("'checkContactsReachability' failed.");
                bvjy = null;
            }
        }
        if (bvjy == null) {
            return false;
        }
        sqv sqv2 = this.f71619d;
        C1223np npVar = new C1223np();
        bxwc bxwc3 = bvjy.f156369a;
        int size3 = bxwc3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            bvjx bvjx = (bvjx) bxwc3.get(i3);
            npVar.put(bvjx.f156364a, bvjx);
        }
        long a2 = sqv2.mo20505a();
        int i4 = 5;
        bxvd bxvd = (bxvd) ajih2.mo74142c(5);
        bxvd.mo73625a((bxvk) ajih2);
        ajig ajig2 = (ajig) bxvd;
        int i5 = 0;
        while (i5 < ((ajih) ajig2.f164949b).f70709a.size()) {
            ajif a3 = ajig2.mo38670a(i5);
            ajii ajii2 = a3.f70697b;
            if (ajii2 == null) {
                ajii2 = ajii.f70710d;
            }
            bvjx bvjx2 = (bvjx) npVar.get(ajii2.f70714c);
            if (bvjx2 != null) {
                bxvd bxvd2 = (bxvd) a3.mo74142c(i4);
                bxvd2.mo73625a((bxvk) a3);
                ajie ajie = (ajie) bxvd2;
                boolean z = bvjx2.f156365b;
                if (ajie.f164950c) {
                    ajie.mo74035c();
                    ajie.f164950c = false;
                }
                ajif ajif3 = (ajif) ajie.f164949b;
                ajif ajif4 = ajif.f70694l;
                int i6 = ajif3.f70696a | 16;
                ajif3.f70696a = i6;
                ajif3.f70703h = z;
                boolean z2 = bvjx2.f156366c;
                int i7 = i6 | 32;
                ajif3.f70696a = i7;
                ajif3.f70704i = z2;
                ajif3.f70696a = i7 | 64;
                ajif3.f70705j = a2;
                ajig2.mo38671a(i5, ajie);
            }
            i5++;
            i4 = 5;
        }
        if (this.f71618c.mo39434a(account2, (ajih) ajig2.mo74062i())) {
            return true;
        }
        bnsl bnsl4 = (bnsl) ajvp.f71371a.mo68388c();
        bnsl4.mo68432a("akcv", "a", 342, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68405a("Failed to save contact book to disk after refreshing reachability.");
        return false;
    }
}
