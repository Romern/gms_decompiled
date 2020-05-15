package p000;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.matchstick.net.MessagingService;
import java.util.concurrent.TimeUnit;

/* renamed from: azhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhp extends azhc {

    /* renamed from: b */
    private final String f99393b;

    /* renamed from: c */
    private final aznz f99394c;

    /* renamed from: d */
    private final boolean f99395d;

    /* renamed from: e */
    private final boolean f99396e;

    /* renamed from: f */
    private final azfx f99397f;

    /* renamed from: g */
    private final azcl f99398g;

    /* renamed from: h */
    private final MessagingService f99399h;

    /* renamed from: i */
    private final long f99400i;

    /* renamed from: j */
    private final azfo f99401j;

    /* renamed from: k */
    private final LocalEntityId f99402k;

    public azhp(Context context, azfx azfx, String str, String str2, long j, MessagingService messagingService, azfo azfo, boolean z, azcl azcl, boolean z2) {
        super(context, azfx, "Save draft");
        this.f99393b = str;
        aznz a = aznz.m85891a(str2);
        this.f99394c = a;
        this.f99400i = j;
        this.f99395d = z;
        this.f99396e = z2;
        this.f99397f = azfx;
        this.f99399h = messagingService;
        this.f99401j = azfo;
        this.f99398g = azcl;
        this.f99402k = a.f99780g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo54920a(Object obj) {
        Void voidR = (Void) obj;
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo54924b() {
        int i;
        aznz aznz = this.f99394c;
        if (aznz != null && !aznz.mo55106d()) {
            if (TextUtils.equals(this.f99394c.f99775b, "FB")) {
                aznz aznz2 = this.f99394c;
                String str = aznz2.f99774a;
                LocalEntityId localEntityId = aznz2.f99781h;
                azcm a = azcm.m85300a(this.f99339a);
                if (!a.mo54651a()) {
                    a.f98996b = azcl.m85289a(a.f98995a).getReadableDatabase();
                }
                a.f98996b.beginTransaction();
                try {
                    boolean g = a.mo54670g(str);
                    a.f98996b.setTransactionSuccessful();
                    a.f98996b.endTransaction();
                    if (!g) {
                        new Object[1][0] = str;
                    } else {
                        new Object[1][0] = str;
                        try {
                            azdj.m85399a(this.f99339a).mo54719a(localEntityId, 3);
                            bxvd da = cbhg.f177127c.mo74144da();
                            bxvd a2 = azfn.m85571a(this.f99339a, this.f99402k);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cbmo cbmo = (cbmo) a2.mo74062i();
                            cbmo.getClass();
                            ((cbhg) da.f164949b).f177129a = cbmo;
                            cbhu a3 = localEntityId.mo60370a();
                            if (a3 != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                a3.getClass();
                                ((cbhg) da.f164949b).f177130b = a3;
                            }
                            cbhg cbhg = (cbhg) da.mo74062i();
                            new Object[1][0] = cbhg;
                            try {
                                afiz afiz = (afiz) azht.m85748a(this.f99339a).mo54933a(2);
                                ClientContext b = azht.m85748a(this.f99339a).mo54935b(2);
                                if (afiz.f64275g == null) {
                                    afiz.f64275g = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.MatchstickAbuse/UnblockEntity", ciie.m150370a(cbhg.f177127c), ciie.m150370a(cbhh.f177131a));
                                }
                                cbhh cbhh = (cbhh) afiz.f64277a.mo25553a(afiz.f64275g, b, cbhg, (long) afiz.f64270b, TimeUnit.MILLISECONDS);
                                azdj.m85399a(this.f99339a).mo54719a(localEntityId, 4);
                                if (!DatabaseProvider.m94531a(this.f99339a.getContentResolver(), str, false)) {
                                    azho.m85726a(this.f99339a, C0126R.string.common_something_went_wrong);
                                }
                            } catch (chuw e) {
                                e = e;
                                azoj.m85931a("SaveComposedMH", e, "Error sending rpc", new Object[0]);
                                azho.m85727a(this.f99339a, this.f99401j, e, (Intent) null, this.f99402k, azcv.m85357a(this.f99339a).mo54689a(this.f99402k));
                                azho.m85726a(this.f99339a, C0126R.string.common_something_went_wrong);
                                return null;
                            } catch (gid e2) {
                                e = e2;
                                azoj.m85931a("SaveComposedMH", e, "Error sending rpc", new Object[0]);
                                azho.m85727a(this.f99339a, this.f99401j, e, (Intent) null, this.f99402k, azcv.m85357a(this.f99339a).mo54689a(this.f99402k));
                                azho.m85726a(this.f99339a, C0126R.string.common_something_went_wrong);
                                return null;
                            }
                        } catch (SQLiteException e3) {
                        }
                    }
                } catch (Throwable th) {
                    Throwable th2 = th;
                    a.f98996b.setTransactionSuccessful();
                    a.f98996b.endTransaction();
                    throw th2;
                }
            }
            azcm a4 = azcm.m85300a(this.f99339a);
            String str2 = this.f99393b;
            String str3 = this.f99394c.f99774a;
            boolean z = this.f99395d;
            azph a5 = azph.m85998a(this.f99339a);
            byte[] bytes = str2.getBytes();
            String a6 = azfn.m85576a();
            boolean inTransaction = a4.f98996b.inTransaction();
            if (!inTransaction) {
                a4.f98996b.beginTransaction();
            }
            if (!z) {
                i = 40;
            } else {
                i = 30;
            }
            try {
                a4.mo54642a(a6, -2, str3, i, bytes, "text/plain", "text/plain", System.currentTimeMillis(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), null, 0, null, a5);
                if (!inTransaction) {
                    a4.f98996b.setTransactionSuccessful();
                }
                if (!inTransaction) {
                    a4.f98996b.endTransaction();
                }
                this.f99339a.getContentResolver().notifyChange(DatabaseProvider.m94534b(this.f99394c.f99774a), null);
                if (this.f99395d) {
                    azph.m85998a(this.f99339a).mo55131a(86, 3, a6, aznz.m85891a(this.f99394c.f99774a));
                    new azhq(this.f99339a, this.f99397f, a6, this.f99394c.f99774a, this.f99400i, this.f99399h, this.f99398g, this.f99401j, SystemClock.elapsedRealtime() + cfeo.m138851H(), false, this.f99396e).mo54921a();
                }
            } catch (Throwable th3) {
                if (!inTransaction) {
                    a4.f98996b.endTransaction();
                }
                throw th3;
            }
        } else {
            azoj.m85933c("SaveComposedMH", "Tried to reply to encrypted chat, not supported.", new Object[0]);
            azho.m85726a(this.f99339a, C0126R.string.common_something_went_wrong);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54922a(Object obj, Exception exc) {
        Void voidR = (Void) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54923a(Object obj, Object obj2) {
        Void voidR = (Void) obj;
        Void voidR2 = (Void) obj2;
    }
}
