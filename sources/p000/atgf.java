package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: atgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atgf {

    /* renamed from: a */
    public static final srn f90279a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public static final brer f90280b = new atfu();

    /* renamed from: c */
    public static final brer f90281c = new atfv();

    /* renamed from: d */
    public static final brer f90282d = new atfw();

    /* renamed from: e */
    public static final brer f90283e = new atfx();

    /* renamed from: f */
    public static final bnic f90284f = bnic.m109494a(f90280b, bret.TIMEOUT_OCCURRED, bret.OPEN_FAILED, bret.READ_FAILED, bret.REMOTE_ACCESS_FAILED, bret.NOT_CLOSED, bret.ALREADY_ACTIVATED, bret.CURRENTLY_ACTIVATING, bret.USED_BY_OTHER_APP, bret.ACTIVATE_HTTP_ERROR, bret.ONLINE_NETWORK_ERROR, bret.ONLINE_SERVER_BUSY);

    /* renamed from: j */
    private static final String[] f90285j = {Felica.MFI_PERMIT};

    /* renamed from: k */
    private static final Integer f90286k = -1;

    /* renamed from: l */
    private static brgl f90287l;

    /* renamed from: g */
    public final Context f90288g;

    /* renamed from: h */
    public final athd f90289h;

    /* renamed from: i */
    public final brgl f90290i;

    public atgf(Context context, brgl brgl, athd athd) {
        this.f90288g = context;
        this.f90290i = brgl;
        this.f90289h = athd;
    }

    /* renamed from: a */
    public static atgf m75807a(Context context) {
        return new atgf(context, m75810b(context), new athd(context));
    }

    /* renamed from: b */
    public static synchronized brgl m75810b(Context context) {
        brgl brgl;
        synchronized (atgf.class) {
            if (f90287l == null) {
                atgo atgo = new atgo(context);
                bqgj b = snp.m35704b(9);
                f90287l = new brgl(f90285j, new atgr(context.getApplicationContext(), new brha(), b, new atfo(context), atgo));
            }
            brgl = f90287l;
        }
        return brgl;
    }

    /* renamed from: a */
    private final bngx m75808a(String str, int i) {
        if (!mo49941a(str)) {
            throw new bres(f90281c);
        } else if (((Boolean) askd.f89119k.mo58455c()).booleanValue()) {
            Cursor rawQuery = this.f90289h.mo49984a().getReadableDatabase().rawQuery("SELECT * FROM Cards", new String[0]);
            try {
                ArrayList arrayList = new ArrayList(rawQuery.getCount());
                while (rawQuery.moveToNext()) {
                    arrayList.add(bepm.m95390a(rawQuery));
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                bngs j = bngx.m109377j();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    j.mo67668c(new athc((bepl) arrayList.get(i2)));
                }
                return j.mo67664a();
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            atga atga = new atga();
            this.f90290i.mo69518a(str, atga, i);
            return (bngx) atga.mo49935a();
        }
        throw th;
    }

    /* renamed from: b */
    public final bngx mo49942b(atgt atgt) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        atgg.m75818a(atgt, this.f90288g).mo49983b(new atft(atomicReference2, countDownLatch, atomicReference));
        m75809a(countDownLatch);
        bres bres = (bres) atomicReference2.get();
        if (bres == null) {
            return (bngx) atomicReference.get();
        }
        throw bres;
    }

    /* renamed from: b */
    public final bngx mo49943b(String str) {
        bngs bngs = new bngs();
        bnre i = m75808a(str, 1).listIterator();
        while (i.hasNext()) {
            bngs.mo67668c(((atgp) i.next()).mo49964a());
        }
        return bngs.mo67664a();
    }

    /* renamed from: a */
    public static void m75809a(CountDownLatch countDownLatch) {
        try {
            long a = cgwh.f187848a.mo6606a().mo84564a();
            if (a != ((long) f90286k.intValue())) {
                bryx bryx = new bryx(1, Long.valueOf(a));
                if (countDownLatch.await(a, TimeUnit.SECONDS)) {
                    ((bnsl) f90279a.mo68390d()).mo68420a("Able to get response from Felica within timeout of %s seconds", bryx);
                } else {
                    ((bnsl) f90279a.mo68387b()).mo68420a("Not able to get response from Felica within timeout of %s seconds", bryx);
                    throw new bres(f90283e);
                }
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new bres(f90280b);
        }
    }

    /* renamed from: a */
    public final brfb mo49938a(atgt atgt) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        brfc a = atgg.m75818a(atgt, this.f90288g);
        ((bnsl) f90279a.mo68390d()).mo68420a("Reading default card data for %s", atgt.name());
        a.mo49979a(new atgb(atomicReference, countDownLatch, atomicReference2));
        m75809a(countDownLatch);
        bres bres = (bres) atomicReference2.get();
        if (bres == null) {
            return (brfb) atomicReference.get();
        }
        throw bres;
    }

    /* renamed from: a */
    public final void mo49939a(String str, atgt atgt, String str2, String str3) {
        atgp atgp;
        if (mo49941a(str)) {
            bnre i = m75808a(str, 2).listIterator();
            while (true) {
                if (!i.hasNext()) {
                    atgp = null;
                    break;
                }
                atgp = (atgp) i.next();
                if (atgp.mo49964a().getCid().equals(str2)) {
                    break;
                }
            }
            if (atgp != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("linkageData", str3);
                JSONObject jSONObject2 = new JSONObject();
                if (atgt.f90321f == atgs.QUICPAY) {
                    jSONObject2.put("dynamicCardData", jSONObject);
                }
                if (atgt.f90321f == atgs.ID) {
                    jSONObject2.put("cid", str2);
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AtomicReference atomicReference = new AtomicReference();
                atgg.m75818a(atgt, this.f90288g).mo49981a(str, atgp.mo49967b(), jSONObject2, new atgc(countDownLatch, atomicReference));
                m75809a(countDownLatch);
                bres bres = (bres) atomicReference.get();
                if (bres != null) {
                    throw bres;
                }
                return;
            }
            return;
        }
        throw new bres(f90281c);
    }

    /* renamed from: a */
    public final boolean mo49940a() {
        if (!cgwh.f187848a.mo6606a().mo84565b()) {
            return false;
        }
        if (((Boolean) askd.f89119k.mo58455c()).booleanValue()) {
            return true;
        }
        m75810b(this.f90288g);
        try {
            String mFCVersion = Felica.getMFCVersion(this.f90288g);
            StringBuilder sb = new StringBuilder(String.valueOf(mFCVersion).length() + 26);
            sb.append("MFC version ");
            sb.append(mFCVersion);
            sb.append(" is available.");
            sb.toString();
        } catch (FelicaException e) {
            if (e.getType() == 60) {
                return false;
            }
        } catch (NullPointerException | RuntimeException e2) {
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo49941a(String str) {
        SharedPreferences sharedPreferences = this.f90288g.getSharedPreferences("com.google.android.gms.tapandpay.secard.api.FelicaApi", 0);
        String valueOf = String.valueOf(str);
        boolean z = sharedPreferences.getBoolean(valueOf.length() == 0 ? new String("felica_tos_accepted") : "felica_tos_accepted".concat(valueOf), false);
        if (z || !((Boolean) askd.f89119k.mo58455c()).booleanValue()) {
            return z;
        }
        String valueOf2 = String.valueOf(str);
        return sharedPreferences.getBoolean(valueOf2.length() == 0 ? new String("fake_felica_tos_accepted") : "fake_felica_tos_accepted".concat(valueOf2), false);
    }
}
