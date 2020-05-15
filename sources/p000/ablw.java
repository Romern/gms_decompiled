package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.provider.Settings;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: ablw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ablw implements ablh {

    /* renamed from: a */
    public static final srn f57677a = srn.m36127a(sgj.GROWTH);

    /* renamed from: b */
    public final abij f57678b;

    /* renamed from: c */
    public final abjt f57679c;

    /* renamed from: d */
    public final Context f57680d;

    /* renamed from: e */
    private final sqv f57681e;

    /* renamed from: f */
    private final abji f57682f;

    /* renamed from: g */
    private final abla f57683g;

    public ablw(abij abij, sqv sqv, abjt abjt, abji abji, Context context, abla abla) {
        this.f57678b = abij;
        this.f57681e = sqv;
        this.f57679c = abjt;
        this.f57682f = abji;
        this.f57680d = context;
        this.f57683g = abla;
    }

    /* renamed from: a */
    static final /* synthetic */ void m47874a(String str, Throwable th) {
        bnsl bnsl = (bnsl) f57677a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("ablw", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Storage failure during onAppInstall(%s)", str);
    }

    /* renamed from: b */
    static final /* synthetic */ void m47876b(String str, Throwable th) {
        bnsl bnsl = (bnsl) f57677a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("ablw", "b", 86, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Storage failure during trackAppInstall(%s, session)", str);
    }

    /* renamed from: c */
    static final /* synthetic */ void m47878c(Throwable th) {
        bnsl bnsl = (bnsl) f57677a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("ablw", "c", 161, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Storage failure during trackDefaultIme(session)");
    }

    /* renamed from: d */
    static final /* synthetic */ void m47879d(Throwable th) {
        bnsl bnsl = (bnsl) f57677a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("ablw", "d", 146, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Storage failure during onDuoRegistered()");
    }

    /* renamed from: e */
    static final /* synthetic */ void m47880e(Throwable th) {
        bnsl bnsl = (bnsl) f57677a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("ablw", "e", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Storage failure during trackDuoRegistration(session)");
    }

    /* renamed from: a */
    static final /* synthetic */ void m47875a(Throwable th) {
        bnsl bnsl = (bnsl) f57677a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("ablw", "a", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Storage failure during scheduleDsuwTask");
    }

    /* renamed from: b */
    static final /* synthetic */ void m47877b(Throwable th) {
        bnsl bnsl = (bnsl) f57677a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68432a("ablw", "b", (int) ErrorInfo.TYPE_SDU_UNKNOWN, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Storage failure during onHandleDefaultInputMethodChange()");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* renamed from: a */
    public final int mo32199a(aecc aecc) {
        char c;
        String str = aecc.f63128a;
        int hashCode = str.hashCode();
        if (hashCode != 310114928) {
            if (hashCode == 980957587 && str.equals("DSUW_TASK")) {
                c = 1;
                if (c == 0) {
                    bqga.m112781a(bqdx.m112674a(bqfl.m112747c(bqdx.m112673a(bqfl.m112747c(this.f57679c.f57588a.mo60776a()), abjr.f57586a, bqfb.INSTANCE)), new ablu(this), bqfb.INSTANCE), abid.m47742a(ablv.f57676a), bqfb.INSTANCE);
                } else if (c == 1 && cejr.m136993b()) {
                    abla abla = this.f57683g;
                    Context context = this.f57680d;
                    abij abij = this.f57678b;
                    if (cejr.m136993b()) {
                        bqga.m112781a(bqdx.m112674a(bqfl.m112747c(abla.f57657b.mo32145a()), new abky(abla, context, abij), bqfb.INSTANCE), abid.m47742a(abkz.f57654a), bqfb.INSTANCE);
                    }
                }
                return 0;
            }
        } else if (str.equals("DEFAULT_INPUT_METHOD_TASK")) {
            c = 0;
            if (c == 0) {
            }
            return 0;
        }
        c = 65535;
        if (c == 0) {
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo32209b() {
        aeat a = aeat.m51532a(this.f57680d);
        aeac aeac = new aeac();
        aeac.f63099k = "DEFAULT_INPUT_METHOD_TASK";
        aeac.f63097i = "com.google.android.gms.growth.watchdog.GrowthWatchdogTaskService";
        aeac.mo34027b(1);
        aeac.f63102n = true;
        aeac.mo34023a(0);
        aeac.mo33972a(new aeab(Settings.Secure.getUriFor("default_input_method"), 0));
        a.mo33984a(aeac.mo33974b());
    }

    /* renamed from: b */
    public final void mo32205b(bxvd bxvd) {
        abjt abjt = this.f57679c;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f57681e.mo20505a());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsmh bsmh = (bsmh) bxvd.f164949b;
        bsmh bsmh2 = bsmh.f145025e;
        bsmh.f145027a |= 1;
        bsmh.f145028b = seconds;
        bqga.m112781a(bqfl.m112747c(abjt.f57588a.mo60777a(new abjq((bsmh) bxvd.mo74062i()), bqfb.INSTANCE)), abid.m47743a(new abls(this), ablt.f57674a), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo32200a() {
        bqga.m112781a(bqdx.m112674a(bqfl.m112747c(bqdx.m112673a(bqfl.m112747c(this.f57679c.f57588a.mo60776a()), abjo.f57583a, bqfb.INSTANCE)), new ablq(this), bqfb.INSTANCE), abid.m47742a(ablr.f57672a), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo32201a(Context context, Intent intent) {
        byte[] bArr;
        if (cejr.m136993b()) {
            try {
                bArr = (byte[]) this.f57682f.mo32145a().get();
            } catch (InterruptedException | ExecutionException e) {
                bnsl bnsl = (bnsl) f57677a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ablw", "a", 228, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Storage failure during scheduleDsuwTask");
                bArr = null;
            }
            if (bArr == null) {
                Parcel obtain = Parcel.obtain();
                intent.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                byte[] copyOf = Arrays.copyOf(marshall, marshall.length);
                obtain.recycle();
                bqga.m112781a(bqfl.m112747c(this.f57682f.f57576a.mo60777a(new abjf(copyOf), bqfb.INSTANCE)), abid.m47743a(new abll(context), ablm.f57666a), bqfb.INSTANCE);
                return;
            }
            aeat a = aeat.m51532a(context);
            aeac aeac = new aeac();
            aeac.f63099k = "DSUW_TASK";
            aeac.f63097i = "com.google.android.gms.growth.watchdog.GrowthWatchdogTaskService";
            aeac.mo34027b(1);
            aeac.f63102n = true;
            aeac.mo34023a(0);
            aeac.mo33972a(new aeab(Settings.Secure.getUriFor("user_setup_personalization_state"), 0));
            a.mo33984a(aeac.mo33974b());
        }
    }

    /* renamed from: a */
    public final void mo32202a(bxvd bxvd) {
        abjt abjt = this.f57679c;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f57681e.mo20505a());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsmh bsmh = (bsmh) bxvd.f164949b;
        bsmh bsmh2 = bsmh.f145025e;
        bsmh.f145027a |= 1;
        bsmh.f145028b = seconds;
        bqga.m112781a(bqfl.m112747c(abjt.f57588a.mo60777a(new abjn((bsmh) bxvd.mo74062i()), bqfb.INSTANCE)), abid.m47742a(ablp.f57670a), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo32203a(String str) {
        bqga.m112781a(bqdx.m112674a(bqfl.m112747c(bqdx.m112673a(bqfl.m112747c(this.f57679c.f57588a.mo60776a()), new abjl(str), bqfb.INSTANCE)), new abln(this, str), bqfb.INSTANCE), abid.m47742a(new ablo(str)), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo32204a(String str, bxvd bxvd) {
        abjt abjt = this.f57679c;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f57681e.mo20505a());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsmh bsmh = (bsmh) bxvd.f164949b;
        bsmh bsmh2 = bsmh.f145025e;
        bsmh.f145027a |= 1;
        bsmh.f145028b = seconds;
        bqga.m112781a(bqfl.m112747c(abjt.f57588a.mo60777a(new abjk(str, (bsmh) bxvd.mo74062i()), bqfb.INSTANCE)), abid.m47742a(new ablk(str)), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final boolean mo32208a(bsmh bsmh, long j) {
        return bsmh != null && TimeUnit.MILLISECONDS.toSeconds(this.f57681e.mo20505a()) - bsmh.f145028b < j;
    }
}
