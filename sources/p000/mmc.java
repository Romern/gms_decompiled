package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.Telephony;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: mmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mmc implements mmh {

    /* renamed from: a */
    public static final lvn f33990a = new lvn("AppDataFlavorHandler");

    /* renamed from: b */
    public final mhf f33991b;

    /* renamed from: c */
    public final mfr f33992c;

    /* renamed from: d */
    public final met f33993d;

    /* renamed from: e */
    public final mfp f33994e;

    /* renamed from: f */
    public boolean f33995f = false;

    /* renamed from: g */
    public final Set f33996g;

    /* renamed from: h */
    public final Set f33997h;

    /* renamed from: i */
    private final Context f33998i;

    /* renamed from: j */
    private final long f33999j = cckw.f179263a.mo6606a().mo76236a();

    /* renamed from: k */
    private final List f34000k;

    public mmc(Context context, mfr mfr, met met, mfp mfp, mhf mhf) {
        boolean z;
        boolean z2;
        this.f33998i = context;
        this.f33994e = mfp;
        this.f33991b = mhf;
        this.f33992c = mfr;
        this.f33993d = met;
        ArrayList arrayList = new ArrayList();
        this.f33996g = new HashSet(mfr.m24970a(this.f33998i));
        this.f33997h = new HashSet(mfr.m24973b(this.f33998i));
        this.f33996g.remove("com.android.providers.telephony");
        this.f33997h.remove("com.android.providers.telephony");
        arrayList.addAll(this.f33996g);
        arrayList.addAll(this.f33997h);
        if (C1133kh.m17835a(this.f33998i, "android.permission.READ_SMS") == 0) {
            mhd mhd = this.f33991b.f33715b;
            Cursor a = mhd.mo20008a();
            Cursor b = mhd.mo20010b();
            if (a == null || !a.moveToFirst()) {
                z = true;
            } else {
                z = false;
            }
            if (b == null || !b.moveToFirst()) {
                z2 = true;
            } else {
                z2 = false;
            }
            srz.m36171a(a);
            srz.m36171a(b);
            if (z && z2) {
                f33990a.mo25412b("No SMS data found. Not providing SMS as an option.", new Object[0]);
                this.f33995f = false;
                this.f33993d.mo19896a("com.android.providers.telephony", 6);
            } else {
                f33990a.mo25412b("Including dummy telephony package.", new Object[0]);
                arrayList.add("com.android.providers.telephony");
                this.f33995f = true;
            }
        } else {
            f33990a.mo25412b("SMS permission not granted. Not providing SMS as an option.", new Object[0]);
            this.f33995f = false;
            this.f33993d.mo19896a("com.android.providers.telephony", 10);
        }
        this.f34000k = arrayList;
        mce.m24862c();
    }

    /* renamed from: a */
    public static boolean m25320a(String str) {
        return "com.android.providers.telephony".equals(str);
    }

    /* renamed from: b */
    public final mtr mo20165b() {
        mhf mhf = this.f33991b;
        if (mhf.f33716c == null) {
            ContentResolver contentResolver = mhf.f33714a.getContentResolver();
            mhf.f33716c = mtr.f34701h.mo74144da();
            bxvd bxvd = mhf.f33716c;
            int a = mhf.mo20011a(contentResolver.query(Telephony.Sms.CONTENT_URI, new String[]{"_id"}, null, null, null));
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            mtr mtr = (mtr) bxvd.f164949b;
            mtr.f34703a |= 1;
            mtr.f34704b = a;
            bxvd bxvd2 = mhf.f33716c;
            int a2 = mhf.mo20011a(contentResolver.query(Telephony.Mms.CONTENT_URI, new String[]{"_id"}, null, null, null));
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            mtr mtr2 = (mtr) bxvd2.f164949b;
            mtr2.f34703a |= 2;
            mtr2.f34705c = a2;
            bxvd bxvd3 = mhf.f33716c;
            int a3 = mhf.mo20011a(contentResolver.query(Telephony.Mms.CONTENT_URI.buildUpon().appendPath("part").build(), new String[]{"_id"}, "ct=?", new String[]{"text/plain"}, null));
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            mtr mtr3 = (mtr) bxvd3.f164949b;
            mtr3.f34703a |= 4;
            mtr3.f34706d = a3;
            bxvd bxvd4 = mhf.f33716c;
            int a4 = mhf.mo20011a(contentResolver.query(Telephony.Mms.CONTENT_URI.buildUpon().appendPath("part").build(), new String[]{"_id"}, null, null, null));
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            mtr mtr4 = (mtr) bxvd4.f164949b;
            mtr4.f34703a |= 8;
            mtr4.f34707e = a4;
        }
        bxvd bxvd5 = mhf.f33716c;
        long j = mhf.f33715b.f33701j;
        if (bxvd5.f164950c) {
            bxvd5.mo74035c();
            bxvd5.f164950c = false;
        }
        mtr mtr5 = (mtr) bxvd5.f164949b;
        mtr mtr6 = mtr.f34701h;
        mtr5.f34703a |= 16;
        mtr5.f34708f = j;
        bxvd bxvd6 = mhf.f33716c;
        long j2 = mhf.f33715b.f33702k;
        if (bxvd6.f164950c) {
            bxvd6.mo74035c();
            bxvd6.f164950c = false;
        }
        mtr mtr7 = (mtr) bxvd6.f164949b;
        mtr7.f34703a |= 32;
        mtr7.f34709g = j2;
        return (mtr) mhf.f33716c.mo74062i();
    }

    /* renamed from: a */
    public final InputStream mo20162a(mph mph) {
        f33990a.mo25412b("Backup data requested for: %s", mph.f34146d);
        if ("restore_token_file".equals(mph.f34146d)) {
            return new ByteArrayInputStream(String.valueOf(spn.m35843a(this.f33998i)).getBytes(StandardCharsets.UTF_8));
        }
        return new mmt(new mmb(this, mph));
    }

    /* renamed from: a */
    public final List mo20163a() {
        ArrayList arrayList = new ArrayList();
        bxvd da = mph.f34141f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mph mph = (mph) da.f164949b;
        "restore_token_file".getClass();
        mph.f34143a |= 1;
        mph.f34146d = "restore_token_file";
        arrayList.add((mph) da.mo74062i());
        List list = this.f34000k;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            bxvd da2 = mph.f34141f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            mph mph2 = (mph) da2.f164949b;
            str.getClass();
            int i2 = mph2.f34143a | 1;
            mph2.f34143a = i2;
            mph2.f34146d = str;
            long j = this.f33999j;
            mph2.f34143a = i2 | 2;
            mph2.f34147e = j;
            if (m25320a(str) && ccnr.f179566a.mo6606a().mo76489j()) {
                mtr b = mo20165b();
                bxvd da3 = mpr.f34208f.mo74144da();
                int i3 = b.f34704b;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                mpr mpr = (mpr) da3.f164949b;
                int i4 = mpr.f34210a | 1;
                mpr.f34210a = i4;
                mpr.f34211b = i3;
                int i5 = b.f34705c;
                int i6 = i4 | 2;
                mpr.f34210a = i6;
                mpr.f34212c = i5;
                int i7 = b.f34706d;
                int i8 = i6 | 4;
                mpr.f34210a = i8;
                mpr.f34213d = i7;
                int i9 = b.f34707e;
                mpr.f34210a = i8 | 8;
                mpr.f34214e = i9;
                mpr mpr2 = (mpr) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                mph mph3 = (mph) da2.f164949b;
                mpr2.getClass();
                mph3.f34145c = mpr2;
                mph3.f34144b = 102;
            }
            arrayList.add((mph) da2.mo74062i());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo20164a(mph mph, InputStream inputStream) {
        srz.m36171a((Closeable) inputStream);
        if (!this.f33996g.contains(mph.f34146d)) {
            this.f33994e.mo19920a(mph.f34146d).delete();
        }
    }
}
