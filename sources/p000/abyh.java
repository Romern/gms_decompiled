package p000;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.CacheSpec;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: abyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyh {

    /* renamed from: f */
    public static final /* synthetic */ int f58725f = 0;

    /* renamed from: g */
    private static final long f58726g = TimeUnit.HOURS.toSeconds(24);

    /* renamed from: a */
    public final abyj f58727a;

    /* renamed from: b */
    public final Object f58728b = new Object();

    /* renamed from: c */
    public final Map f58729c = new HashMap();

    /* renamed from: d */
    public final bnmu f58730d = bndu.m109109r();

    /* renamed from: e */
    public final Queue f58731e = new PriorityQueue(1, abyg.f58724a);

    /* renamed from: h */
    private final Context f58732h;

    public abyh(Context context) {
        this.f58732h = context;
        this.f58727a = new abyj(context);
    }

    /* renamed from: a */
    public static String m48537a(String str, String str2) {
        return TextUtils.join(":", Arrays.asList(str, str2));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: b */
    public final void mo32434b() {
        if (cemw.m137395c() && !mo32432a()) {
            synchronized (this.f58728b) {
                for (abqa abqa : this.f58729c.values()) {
                    String str = abqa.f57933b;
                    absg.m48185a("Sending directed broadcast event to %s to invalidate everything", str);
                    this.f58732h.sendBroadcast(new Intent("com.google.android.gms.icing.PROPAGATE_DELETE").setPackage(str).putExtra("com.google.android.gms.icing.extra.invalidate_all_caches", true));
                }
                this.f58729c.clear();
                this.f58730d.mo67270d();
                this.f58731e.clear();
                try {
                    this.f58727a.mo32436a(bngx.m109376e());
                } catch (IOException e) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo32430a(abqa abqa) {
        String a = m48537a(abqa.f57933b, abqa.f57932a);
        synchronized (this.f58728b) {
            this.f58729c.remove(a);
            for (abqb abqb : abqa.f57934c) {
                this.f58730d.mo67310c(abqb, abqa);
            }
            this.f58731e.remove(abqa);
            try {
                this.f58727a.mo32436a(new ArrayList(this.f58729c.values()));
            } catch (IOException e) {
                absg.m48206e("Failed to persist client cache records, error:%s", e);
                mo32434b();
            }
        }
    }

    /* renamed from: a */
    public final void mo32431a(String str, String str2, String str3) {
        if (cemw.m137395c() && !mo32432a()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (this.f58728b) {
                while (true) {
                    abqa abqa = (abqa) this.f58731e.peek();
                    if (abqa != null && elapsedRealtime >= abqa.f57935d) {
                        mo32435b(abqa.f57933b, abqa.f57932a);
                        mo32430a(abqa);
                    }
                }
            }
            synchronized (this.f58728b) {
                bxvd da = abqb.f57936c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abqb abqb = (abqb) da.f164949b;
                str.getClass();
                abqb.f57938a = str;
                str2.getClass();
                abqb.f57939b = str2;
                abqb abqb2 = (abqb) da.mo74062i();
                if (this.f58730d.mo67271d(abqb2)) {
                    HashSet<String> hashSet = new HashSet();
                    for (abqa abqa2 : ((bnci) this.f58730d).mo67127c(abqb2)) {
                        hashSet.add(abqa2.f57933b);
                    }
                    bnzd a = bnzi.m110896a().mo68732a();
                    a.mo68725a(str, Charset.defaultCharset());
                    a.mo68725a(str3, Charset.defaultCharset());
                    String valueOf = String.valueOf(new apob(a.mo68729a().mo68741c()).f84757a);
                    for (String str4 : hashSet) {
                        absg.m48186a("Sending directed broadcast event to %s to invalidate document ID: %s", str4, valueOf);
                        this.f58732h.sendBroadcast(new Intent("com.google.android.gms.icing.PROPAGATE_DELETE").setPackage(str4).putStringArrayListExtra("com.google.android.gms.icing.extra.document_ids", new ArrayList(bngx.m109356a(valueOf))));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo32435b(String str, String str2) {
        absg.m48186a("Sending directed broadcast event to %s to invalidate cache: %s", str, str2);
        this.f58732h.sendBroadcast(new Intent("com.google.android.gms.icing.PROPAGATE_DELETE").setPackage(str).putStringArrayListExtra("com.google.android.gms.icing.extra.cache_names", new ArrayList(bngx.m109356a(str2))));
    }

    /* renamed from: a */
    public final boolean mo32432a() {
        boolean isEmpty;
        synchronized (this.f58728b) {
            isEmpty = this.f58729c.isEmpty();
        }
        return isEmpty;
    }

    /* renamed from: a */
    public final boolean mo32433a(String str, bngx bngx, CacheSpec cacheSpec) {
        if (!cemw.m137395c()) {
            absg.m48205e("Failed to register cache: feature isn't enabled");
            return false;
        } else if (bngx.isEmpty()) {
            absg.m48205e("Failed to register cache: no corpora specified");
            return false;
        } else if (TextUtils.isEmpty(cacheSpec.f9515a)) {
            absg.m48205e("Failed to register cache: name is null or empty");
            return false;
        } else if (!cemj.f182986a.mo6606a().mo79353f().f165797a.contains(str)) {
            absg.m48206e("Failed to register cache: \"%s\" isn't whitelisted", str);
            return false;
        } else {
            ArrayList<abqb> arrayList = new ArrayList();
            bnre i = bngx.listIterator();
            while (i.hasNext()) {
                absr absr = (absr) i.next();
                String str2 = absr.f58138c;
                String b = abww.m48413a(str2) ? abww.m48415b(str2.substring(12)) : "";
                if (cemj.f182986a.mo6606a().mo79352e().f165797a.contains(b)) {
                    bxvd da = abqb.f57936c.mo74144da();
                    String str3 = absr.f58140e;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    abqb abqb = (abqb) da.f164949b;
                    str3.getClass();
                    abqb.f57938a = str3;
                    String str4 = absr.f58138c;
                    str4.getClass();
                    abqb.f57939b = str4;
                    arrayList.add((abqb) da.mo74062i());
                } else {
                    absg.m48206e("Failed to register cache: indexable type \"%s\" isn't whitelisted", b);
                    return false;
                }
            }
            long j = (long) cacheSpec.f9516b;
            long j2 = f58726g;
            if (j > j2) {
                absg.m48206e("Capping cache TTL to %d seconds", Long.valueOf(j2));
                j = f58726g;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bxvd da2 = abqa.f57930e.mo74144da();
            String str5 = cacheSpec.f9515a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            abqa abqa = (abqa) da2.f164949b;
            str5.getClass();
            abqa.f57932a = str5;
            str.getClass();
            abqa.f57933b = str;
            if (!abqa.f57934c.mo73666a()) {
                abqa.f57934c = GeneratedMessageLite.m124021a(abqa.f57934c);
            }
            bxsy.m123078a(arrayList, abqa.f57934c);
            long j3 = elapsedRealtime + (j * 1000);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((abqa) da2.f164949b).f57935d = j3;
            abqa abqa2 = (abqa) da2.mo74062i();
            String a = m48537a(str, cacheSpec.f9515a);
            synchronized (this.f58728b) {
                abqa abqa3 = (abqa) this.f58729c.get(a);
                if (abqa3 != null) {
                    if (!arrayList.containsAll(abqa3.f57934c)) {
                        mo32435b(abqa3.f57933b, abqa3.f57932a);
                    }
                    mo32430a(abqa3);
                }
                this.f58729c.put(a, abqa2);
                for (abqb abqb2 : arrayList) {
                    this.f58730d.mo67268a(abqb2, abqa2);
                }
                this.f58731e.add(abqa2);
                try {
                    this.f58727a.mo32436a(new ArrayList(this.f58729c.values()));
                } catch (IOException e) {
                    absg.m48206e("Failed to persist client cache records, error:%s", e);
                    mo32434b();
                    return false;
                }
            }
            absg.m48194b("Registered cache \"%s\" for client %s with corpora %s", cacheSpec.f9515a, str, arrayList.toString());
            return true;
        }
    }
}
