package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bgje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgje implements bgme, bugo, bugl {

    /* renamed from: a */
    public final snr f116585a;

    /* renamed from: b */
    public Runnable f116586b;

    /* renamed from: c */
    bugr f116587c = null;

    /* renamed from: d */
    private final Context f116588d;

    /* renamed from: e */
    private final bugn f116589e;

    /* renamed from: f */
    private final sns f116590f;

    /* renamed from: g */
    private final List f116591g = new ArrayList();

    /* renamed from: h */
    private long f116592h = 0;

    /* renamed from: i */
    private boolean f116593i = false;

    private bgje(Context context, bugn bugn) {
        this.f116588d = context;
        this.f116589e = bugn;
        sns sns = new sns("CCC_Handler", 10);
        this.f116590f = sns;
        sns.start();
        this.f116585a = new snr(this.f116590f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        return null;
     */
    /* renamed from: a */
    public static synchronized bgje m99049a(bugp bugp, Context context) {
        bugn a;
        synchronized (bgje.class) {
            if (ceti.f183420a.mo6606a().chreCcSupported() && (a = bugp.mo62634a(context)) != null) {
                bgje bgje = new bgje(context, a);
                bgje.f116589e.mo72629a(5147455389092024333L, bgje, bgje.f116585a);
                return bgje;
            }
        }
    }

    /* renamed from: f */
    static buei m99053f() {
        bxvd da = buei.f153588c.mo74144da();
        bxvd da2 = bueh.f153584c.mo74144da();
        bxtx aL = cetj.f183422a.mo6606a().chreCcConfig().mo73639aL();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bueh bueh = (bueh) da2.f164949b;
        aL.getClass();
        bueh.f153586a |= 1;
        bueh.f153587b = aL;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buei buei = (buei) da.f164949b;
        bueh bueh2 = (bueh) da2.mo74062i();
        bueh2.getClass();
        buei.f153591b = bueh2;
        buei.f153590a = 1;
        return (buei) da.mo74062i();
    }

    /* renamed from: g */
    private final synchronized void m99054g() {
        bugu a;
        bugr bugr = this.f116587c;
        if (!(bugr == null || (a = bugr.mo72640a(1, 1, (bxxc) null)) == null)) {
            a.mo72638a(new bgjc(this));
        }
    }

    /* renamed from: h */
    private final void m99055h() {
        bugr bugr = this.f116587c;
        if (bugr != null) {
            bugr.mo72645b(this);
        }
        this.f116587c = null;
    }

    /* renamed from: b */
    public final synchronized void mo61884b(int i) {
        m99055h();
    }

    /* renamed from: b */
    public final synchronized boolean mo62881b() {
        return this.f116587c != null;
    }

    /* renamed from: c */
    public final synchronized void mo62882c() {
        if (this.f116587c != null) {
            m99052a(m99053f());
        }
        this.f116593i = true;
    }

    /* renamed from: cr */
    public final synchronized void mo61886cr() {
        bugr a = this.f116589e.mo72627a(5147455389092024333L);
        this.f116587c = a;
        if (a != null) {
            a.mo72643a(this, this.f116585a);
            if (this.f116593i) {
                m99052a(m99053f());
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo62884d() {
        if (this.f116587c != null) {
            bxvd da = buei.f153588c.mo74144da();
            bxvd da2 = bueg.f153582a.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buei buei = (buei) da.f164949b;
            bueg bueg = (bueg) da2.mo74062i();
            bueg.getClass();
            buei.f153591b = bueg;
            buei.f153590a = 2;
            m99052a((buei) da.mo74062i());
        }
        this.f116593i = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* renamed from: e */
    public final synchronized void mo62885e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f116592h >= ceti.f183420a.mo6606a().chreCcPingIntervalMillis()) {
            this.f116592h = elapsedRealtime;
            if (this.f116587c == null) {
                mo62883c(6);
                return;
            }
            m99054g();
        }
    }

    /* renamed from: c */
    public final void mo62883c(int i) {
        int i2 = i - 1;
        String valueOf = String.valueOf(Integer.toString(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("logPingFailed, errorCode=");
        sb.append(valueOf);
        sb.toString();
        if (cetp.m138232b()) {
            bxvd da = btxm.f152814q.mo74144da();
            bxvd da2 = btyn.f152946g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btyn btyn = (btyn) da2.f164949b;
            btyn.f152949b = i2;
            btyn.f152948a |= 1;
            boolean f = spn.m35887f();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btyn btyn2 = (btyn) da2.f164949b;
            btyn2.f152948a |= 8;
            btyn2.f152952e = f;
            boolean h = soz.m35811h(rpr.m34216b());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btyn btyn3 = (btyn) da2.f164949b;
            btyn3.f152948a |= 16;
            btyn3.f152953f = h;
            bugr bugr = this.f116587c;
            if (bugr != null) {
                int c = bugr.mo72647c();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btyn btyn4 = (btyn) da2.f164949b;
                btyn4.f152948a |= 4;
                btyn4.f152951d = c;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btxm btxm = (btxm) da.f164949b;
            btyn btyn5 = (btyn) da2.mo74062i();
            btyn5.getClass();
            btxm.f152823h = btyn5;
            btxm.f152816a |= 128;
            m99050a((btxm) da.mo74062i(), 10);
        }
    }

    /* renamed from: a */
    private final void m99050a(btxm btxm, int i) {
        bewr bewr;
        if (!cetp.f183425a.mo6606a().chreCcClearcutAccountEnabled()) {
            qwo a = bewq.m95998a(this.f116588d).f112849a.mo24333a(btxm);
            a.mo24328b(i - 1);
            a.mo24327b();
            return;
        }
        Context context = this.f116588d;
        synchronized (bewr.f112850a) {
            if (bewr.f112851b == null) {
                bewr.f112851b = new bewr(context.getApplicationContext());
            }
            bewr = bewr.f112851b;
        }
        qwo a2 = bewr.f112852c.mo24333a(btxm);
        a2.mo24328b(i - 1);
        a2.mo24327b();
    }

    /* renamed from: a */
    private final void m99051a(budx budx, long j, long j2, int i, boolean z, boolean z2) {
        budx budx2 = budx;
        bxvd da = btxm.f152814q.mo74144da();
        bxvd da2 = btyh.f152908t.mo74144da();
        float f = budx2.f153538a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btyh btyh = (btyh) da2.f164949b;
        int i2 = btyh.f152910a | 1;
        btyh.f152910a = i2;
        btyh.f152911b = f;
        long j3 = budx2.f153539b;
        int i3 = i2 | 2;
        btyh.f152910a = i3;
        btyh.f152912c = (j2 + j3) - j;
        long j4 = budx2.f153539b;
        int i4 = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        btyh.f152910a = i4;
        btyh.f152926q = j4;
        float f2 = budx2.f153544g;
        int i5 = i4 | 4;
        btyh.f152910a = i5;
        btyh.f152917h = f2;
        float f3 = budx2.f153545h;
        int i6 = i5 | 8;
        btyh.f152910a = i6;
        btyh.f152918i = f3;
        float f4 = budx2.f153548k;
        btyh.f152910a = i6 | 16;
        btyh.f152921l = f4;
        for (int i7 = 0; i7 < budx2.f153540c.size(); i7++) {
            buem buem = (buem) budx2.f153540c.get(i7);
            bxvd da3 = btyq.f152966g.mo74144da();
            long j5 = (j2 + buem.f153610a) - j;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            btyq btyq = (btyq) da3.f164949b;
            int i8 = btyq.f152968a | 1;
            btyq.f152968a = i8;
            btyq.f152969b = j5;
            float f5 = buem.f153611b;
            int i9 = i8 | 2;
            btyq.f152968a = i9;
            btyq.f152970c = f5;
            float f6 = buem.f153612c;
            int i10 = i9 | 4;
            btyq.f152968a = i10;
            btyq.f152971d = f6;
            float f7 = buem.f153613d;
            btyq.f152968a = i10 | 8;
            btyq.f152972e = f7;
            btyq btyq2 = (btyq) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btyh btyh2 = (btyh) da2.f164949b;
            btyq2.getClass();
            if (!btyh2.f152913d.mo73666a()) {
                btyh2.f152913d = bxvk.m124021a(btyh2.f152913d);
            }
            btyh2.f152913d.add(btyq2);
        }
        bxwc bxwc = budx2.f153541d;
        int size = bxwc.size();
        for (int i11 = 0; i11 < size; i11++) {
            buem buem2 = (buem) bxwc.get(i11);
            bxvd da4 = btyq.f152966g.mo74144da();
            long j6 = (j2 + buem2.f153610a) - j;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            btyq btyq3 = (btyq) da4.f164949b;
            int i12 = btyq3.f152968a | 1;
            btyq3.f152968a = i12;
            btyq3.f152969b = j6;
            float f8 = buem2.f153611b;
            int i13 = i12 | 2;
            btyq3.f152968a = i13;
            btyq3.f152970c = f8;
            float f9 = buem2.f153612c;
            int i14 = i13 | 4;
            btyq3.f152968a = i14;
            btyq3.f152971d = f9;
            float f10 = buem2.f153613d;
            int i15 = i14 | 8;
            btyq3.f152968a = i15;
            btyq3.f152972e = f10;
            long j7 = buem2.f153614e;
            btyq3.f152968a = i15 | 16;
            btyq3.f152973f = j7;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btyh btyh3 = (btyh) da2.f164949b;
            btyq btyq4 = (btyq) da4.mo74062i();
            btyq4.getClass();
            if (!btyh3.f152914e.mo73666a()) {
                btyh3.f152914e = bxvk.m124021a(btyh3.f152914e);
            }
            btyh3.f152914e.add(btyq4);
        }
        bxwc bxwc2 = budx2.f153542e;
        int size2 = bxwc2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            buem buem3 = (buem) bxwc2.get(i16);
            bxvd da5 = btyq.f152966g.mo74144da();
            long j8 = (j2 + buem3.f153610a) - j;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            btyq btyq5 = (btyq) da5.f164949b;
            int i17 = btyq5.f152968a | 1;
            btyq5.f152968a = i17;
            btyq5.f152969b = j8;
            float f11 = buem3.f153611b;
            int i18 = i17 | 2;
            btyq5.f152968a = i18;
            btyq5.f152970c = f11;
            long j9 = buem3.f153614e;
            btyq5.f152968a = i18 | 16;
            btyq5.f152973f = j9;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btyh btyh4 = (btyh) da2.f164949b;
            btyq btyq6 = (btyq) da5.mo74062i();
            btyq6.getClass();
            if (!btyh4.f152915f.mo73666a()) {
                btyh4.f152915f = bxvk.m124021a(btyh4.f152915f);
            }
            btyh4.f152915f.add(btyq6);
        }
        for (int i19 = 0; i19 < budx2.f153543f.size(); i19++) {
            buej buej = (buej) budx2.f153543f.get(i19);
            bxvd da6 = btyo.f152954f.mo74144da();
            long j10 = (j2 + buej.f153594a) - j;
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            btyo btyo = (btyo) da6.f164949b;
            int i20 = btyo.f152956a | 1;
            btyo.f152956a = i20;
            btyo.f152957b = j10;
            int i21 = buej.f153595b;
            int i22 = i20 | 2;
            btyo.f152956a = i22;
            btyo.f152958c = i21;
            int i23 = buej.f153596c;
            int i24 = i22 | 4;
            btyo.f152956a = i24;
            btyo.f152959d = i23;
            float f12 = buej.f153597d;
            btyo.f152956a = i24 | 8;
            btyo.f152960e = f12;
            btyo btyo2 = (btyo) da6.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btyh btyh5 = (btyh) da2.f164949b;
            btyo2.getClass();
            if (!btyh5.f152916g.mo73666a()) {
                btyh5.f152916g = bxvk.m124021a(btyh5.f152916g);
            }
            btyh5.f152916g.add(btyo2);
        }
        for (int i25 = 0; i25 < budx2.f153546i.size(); i25++) {
            budu budu = (budu) budx2.f153546i.get(i25);
            bxvd da7 = btyf.f152896e.mo74144da();
            long j11 = (j2 + budu.f153520a) - j;
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            btyf btyf = (btyf) da7.f164949b;
            int i26 = btyf.f152898a | 1;
            btyf.f152898a = i26;
            btyf.f152899b = j11;
            int i27 = budu.f153521b;
            int i28 = i26 | 2;
            btyf.f152898a = i28;
            btyf.f152900c = i27;
            float f13 = budu.f153522c;
            btyf.f152898a = i28 | 4;
            btyf.f152901d = f13;
            btyf btyf2 = (btyf) da7.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btyh btyh6 = (btyh) da2.f164949b;
            btyf2.getClass();
            if (!btyh6.f152919j.mo73666a()) {
                btyh6.f152919j = bxvk.m124021a(btyh6.f152919j);
            }
            btyh6.f152919j.add(btyf2);
        }
        for (int i29 = 0; i29 < budx2.f153547j.size(); i29++) {
            budu budu2 = (budu) budx2.f153547j.get(i29);
            bxvd da8 = btyf.f152896e.mo74144da();
            long j12 = (j2 + budu2.f153520a) - j;
            if (da8.f164950c) {
                da8.mo74035c();
                da8.f164950c = false;
            }
            btyf btyf3 = (btyf) da8.f164949b;
            int i30 = btyf3.f152898a | 1;
            btyf3.f152898a = i30;
            btyf3.f152899b = j12;
            int i31 = budu2.f153521b;
            int i32 = i30 | 2;
            btyf3.f152898a = i32;
            btyf3.f152900c = i31;
            float f14 = budu2.f153522c;
            btyf3.f152898a = i32 | 4;
            btyf3.f152901d = f14;
            btyf btyf4 = (btyf) da8.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btyh btyh7 = (btyh) da2.f164949b;
            btyf4.getClass();
            if (!btyh7.f152920k.mo73666a()) {
                btyh7.f152920k = bxvk.m124021a(btyh7.f152920k);
            }
            btyh7.f152920k.add(btyf4);
        }
        for (int i33 = 0; i33 < budx2.f153549l.size(); i33++) {
            budv budv = (budv) budx2.f153549l.get(i33);
            bxvd da9 = btyg.f152902e.mo74144da();
            long j13 = (j2 + budv.f153526a) - j;
            if (da9.f164950c) {
                da9.mo74035c();
                da9.f164950c = false;
            }
            btyg btyg = (btyg) da9.f164949b;
            int i34 = btyg.f152904a | 1;
            btyg.f152904a = i34;
            btyg.f152905b = j13;
            String str = budv.f153528c;
            str.getClass();
            btyg.f152904a = i34 | 2;
            btyg.f152907d = str;
            for (int i35 = 0; i35 < budv.f153527b.size(); i35++) {
                float b = budv.f153527b.mo73923b(i35);
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                btyg btyg2 = (btyg) da9.f164949b;
                if (!btyg2.f152906c.mo73666a()) {
                    btyg2.f152906c = bxvk.m124018a(btyg2.f152906c);
                }
                btyg2.f152906c.mo73922a(b);
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btyh btyh8 = (btyh) da2.f164949b;
            btyg btyg3 = (btyg) da9.mo74062i();
            btyg3.getClass();
            if (!btyh8.f152924o.mo73666a()) {
                btyh8.f152924o = bxvk.m124021a(btyh8.f152924o);
            }
            btyh8.f152924o.add(btyg3);
        }
        btyh btyh9 = (btyh) da2.mo74062i();
        bxvd bxvd = (bxvd) btyh9.mo74142c(5);
        bxvd.mo73625a((bxvk) btyh9);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btyh btyh10 = (btyh) bxvd.f164949b;
        int i36 = btyh10.f152910a | 64;
        btyh10.f152910a = i36;
        btyh10.f152923n = i;
        int i37 = i36 | 32;
        btyh10.f152910a = i37;
        btyh10.f152922m = z;
        btyh10.f152910a = i37 | 128;
        btyh10.f152925p = z2;
        boolean f15 = spn.m35887f();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btyh btyh11 = (btyh) bxvd.f164949b;
        btyh11.f152910a |= 512;
        btyh11.f152927r = f15;
        boolean h = soz.m35811h(rpr.m34216b());
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        btyh btyh12 = (btyh) bxvd.f164949b;
        btyh12.f152910a |= 1024;
        btyh12.f152928s = h;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btxm btxm = (btxm) da.f164949b;
        btyh btyh13 = (btyh) bxvd.mo74062i();
        btyh13.getClass();
        btxm.f152824i = btyh13;
        btxm.f152816a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        m99050a((btxm) da.mo74062i(), 11);
    }

    /* renamed from: a */
    private final void m99052a(buei buei) {
        bugu a;
        bugr bugr = this.f116587c;
        if (bugr != null && (a = bugr.mo72640a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, 1, buei)) != null) {
            try {
                int intValue = ((Integer) a.get(1, TimeUnit.SECONDS)).intValue();
                if (intValue != 0) {
                    StringBuilder sb = new StringBuilder(61);
                    sb.append("Failed to send message to nanoapp: request result=");
                    sb.append(intValue);
                    sb.toString();
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    new String("Failed to send message to nanoapp: ");
                } else {
                    "Failed to send message to nanoapp: ".concat(valueOf);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo61880a(int i) {
        m99055h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo62879a(int i, int i2, boolean z) {
        StringBuilder sb = new StringBuilder(67);
        sb.append("Battery status, scale=");
        sb.append(i);
        sb.append(", level=");
        sb.append(i2);
        sb.append(", plugged=");
        sb.append(z);
        sb.toString();
        bugr bugr = this.f116587c;
        if (bugr != null && this.f116593i) {
            bxvd da = budw.f153530e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            budw budw = (budw) da.f164949b;
            int i3 = budw.f153532a | 1;
            budw.f153532a = i3;
            budw.f153533b = z ? 1 : 0;
            int i4 = i3 | 2;
            budw.f153532a = i4;
            budw.f153534c = i;
            budw.f153532a = i4 | 4;
            budw.f153535d = i2;
            bugu a = bugr.mo72640a(3, 1, (budw) da.mo74062i());
            if (a != null) {
                a.mo72638a(new bgjd());
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo62880a(bgmd bgmd) {
        if (!this.f116591g.contains(bgmd)) {
            this.f116591g.add(bgmd);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
        r0 = (p000.buek) r0.mo72661a((p000.bxxk) p000.buek.f153599c.mo74142c(7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02de, code lost:
        if ((r0.f153601a & 1) == 0) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02e0, code lost:
        r0 = r0.f153602b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02e2, code lost:
        if (r0 != null) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02e4, code lost:
        r0 = p000.buef.f153574f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ea, code lost:
        if (p000.cetp.m138232b() == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02ec, code lost:
        r1 = p000.btxm.f152814q.mo74144da();
        r2 = p000.btyn.f152946g.mo74144da();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02fa, code lost:
        if (r2.f164950c == false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02fc, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0301, code lost:
        r3 = (p000.btyn) r2.f164949b;
        r3.f152949b = 1;
        r3.f152948a |= 1;
        r3 = p000.btyl.f152937g.mo74144da();
        r4 = r0.f153576a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0316, code lost:
        if (r3.f164950c != false) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0319, code lost:
        r3.mo74035c();
        r3.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x031e, code lost:
        r9 = (p000.btyl) r3.f164949b;
        r7 = 1 | r9.f152939a;
        r9.f152939a = r7;
        r9.f152940b = r4;
        r11 = r0.f153577b;
        r4 = r7 | 2;
        r9.f152939a = r4;
        r9.f152941c = r11;
        r7 = r0.f153578c;
        r4 = r4 | 4;
        r9.f152939a = r4;
        r9.f152942d = r7;
        r11 = r0.f153579d;
        r4 = r4 | 8;
        r9.f152939a = r4;
        r9.f152943e = r11;
        r11 = r0.f153580e;
        r9.f152939a = r4 | 16;
        r9.f152944f = r11;
        r0 = (p000.btyl) r3.mo74062i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0351, code lost:
        if (r2.f164950c != false) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0354, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0359, code lost:
        r3 = (p000.btyn) r2.f164949b;
        r0.getClass();
        r3.f152950c = r0;
        r3.f152948a |= 2;
        r0 = p000.spn.m35887f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x036d, code lost:
        if (r2.f164950c != false) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0370, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0375, code lost:
        r3 = (p000.btyn) r2.f164949b;
        r3.f152948a |= 8;
        r3.f152952e = r0;
        r0 = p000.soz.m35811h(p000.rpr.m34216b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x038b, code lost:
        if (r2.f164950c != false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x038e, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0393, code lost:
        r3 = (p000.btyn) r2.f164949b;
        r3.f152948a |= 16;
        r3.f152953f = r0;
        r0 = r10.f116587c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03a2, code lost:
        if (r0 == null) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03a4, code lost:
        r0 = r0.mo72647c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03aa, code lost:
        if (r2.f164950c != false) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03ad, code lost:
        r2.mo74035c();
        r2.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03b2, code lost:
        r3 = (p000.btyn) r2.f164949b;
        r3.f152948a |= 4;
        r3.f152951d = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03bf, code lost:
        if (r1.f164950c != false) goto L_0x03c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03c2, code lost:
        r1.mo74035c();
        r1.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03c7, code lost:
        r0 = (p000.btxm) r1.f164949b;
        r2 = (p000.btyn) r2.mo74062i();
        r2.getClass();
        r0.f152823h = r2;
        r0.f152816a |= 128;
        m99050a((p000.btxm) r1.mo74062i(), 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        mo62883c(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03f0, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo61878a(bugn bugn, bugr bugr, buhd buhd) {
        boolean z;
        budx budx;
        budx budx2;
        buel buel;
        buel buel2;
        buhd buhd2 = buhd;
        synchronized (this) {
            if (bugr != null) {
                int i = buhd2.f153831a;
                int i2 = 1;
                int i3 = 0;
                boolean z2 = false;
                if (i == 2) {
                    synchronized (this) {
                        Runnable runnable = this.f116586b;
                        if (runnable != null) {
                            this.f116585a.removeCallbacks(runnable);
                            this.f116586b = null;
                        }
                    }
                } else if (i != 146) {
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Unknown message type: ");
                    sb.append(i);
                    sb.toString();
                } else {
                    bueb bueb = (bueb) buhd2.mo72661a((bxxk) bueb.f153559g.mo74142c(7));
                    int a = buea.m119372a(bueb.f153562b);
                    if (a == 0) {
                        a = 1;
                    }
                    int i4 = a - 1;
                    if (i4 == 1 || i4 == 2) {
                        int i5 = bueb.f153561a;
                        if ((i5 & 4) != 0) {
                            budx budx3 = bueb.f153564d;
                            if (budx3 == null) {
                                budx3 = budx.f153536m;
                            }
                            int c = bugr.mo72647c();
                            int a2 = buea.m119372a(bueb.f153562b);
                            bgmc bgmc = new bgmc(budx3.f153538a, budx3.f153548k, budx3.f153544g, budx3.f153545h, c, a2 == 0 ? false : a2 == 2);
                            List list = this.f116591g;
                            int size = list.size();
                            boolean z3 = false;
                            for (int i6 = 0; i6 < size; i6++) {
                                z3 |= ((bgmd) list.get(i6)).mo61066a(bgmc);
                            }
                            if (cetp.m138232b()) {
                                budx budx4 = bueb.f153564d;
                                if (budx4 != null) {
                                    budx = budx4;
                                } else {
                                    budx = budx.f153536m;
                                }
                                long j = bueb.f153565e;
                                long currentTimeMillis = System.currentTimeMillis();
                                int c2 = bugr.mo72647c();
                                if (z3) {
                                    z2 = true;
                                }
                                m99051a(budx, j, currentTimeMillis, c2, z2, false);
                            }
                        } else if ((i5 & 2) != 0) {
                            budy budy = bueb.f153563c;
                            if (budy == null) {
                                budy = budy.f153551e;
                            }
                            int c3 = bugr.mo72647c();
                            int a3 = buea.m119372a(bueb.f153562b);
                            if (a3 == 0) {
                                z = false;
                            } else {
                                z = a3 == 2;
                            }
                            bgmc bgmc2 = new bgmc(budy.f153553a, budy.f153554b, budy.f153555c, budy.f153556d, c3, z);
                            List list2 = this.f116591g;
                            int size2 = list2.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                ((bgmd) list2.get(i7)).mo61066a(bgmc2);
                            }
                        }
                    } else if (i4 == 3) {
                        List list3 = this.f116591g;
                        int size3 = list3.size();
                        for (i3++; i3 < size3; i3++) {
                            ((bgmd) list3.get(i3)).mo61065a(bugr.mo72647c());
                        }
                    } else if (i4 != 4) {
                        if (i4 != 5) {
                            int a4 = buea.m119372a(bueb.f153562b);
                            if (a4 != 0) {
                                i2 = a4;
                            }
                            String valueOf = String.valueOf(Integer.toString(i2 - 1));
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                            sb2.append("Unknown event type: ");
                            sb2.append(valueOf);
                            sb2.toString();
                        } else if (cetp.m138232b()) {
                            buee buee = bueb.f153566f;
                            if (buee == null) {
                                buee = buee.f153568d;
                            }
                            int c4 = bugr.mo72647c();
                            bxvd da = btxm.f152814q.mo74144da();
                            bxvd da2 = btyk.f152930f.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            btyk btyk = (btyk) da2.f164949b;
                            btyk.f152932a |= 1;
                            btyk.f152935d = c4;
                            int a5 = bued.m119375a(buee.f153572c);
                            if (a5 == 0) {
                                a5 = 1;
                            }
                            int a6 = btyj.m119010a(a5 - 1);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            btyk btyk2 = (btyk) da2.f164949b;
                            int i8 = a6 - 1;
                            if (a6 != 0) {
                                btyk2.f152936e = i8;
                                btyk2.f152932a |= 2;
                                if (buee.f153570a == 3) {
                                    bxvd da3 = btyp.f152961d.mo74144da();
                                    if (buee.f153570a == 3) {
                                        buel = (buel) buee.f153571b;
                                    } else {
                                        buel = buel.f153603c;
                                    }
                                    int i9 = buel.f153605a;
                                    if (da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    btyp btyp = (btyp) da3.f164949b;
                                    btyp.f152963a |= 1;
                                    btyp.f152964b = i9;
                                    if (buee.f153570a == 3) {
                                        buel2 = (buel) buee.f153571b;
                                    } else {
                                        buel2 = buel.f153603c;
                                    }
                                    bxwc bxwc = buel2.f153606b;
                                    int size4 = bxwc.size();
                                    for (int i10 = 0; i10 < size4; i10++) {
                                        buem buem = (buem) bxwc.get(i10);
                                        bxvd da4 = btyq.f152966g.mo74144da();
                                        long j2 = buem.f153610a;
                                        if (da4.f164950c) {
                                            da4.mo74035c();
                                            da4.f164950c = false;
                                        }
                                        btyq btyq = (btyq) da4.f164949b;
                                        int i11 = btyq.f152968a | 1;
                                        btyq.f152968a = i11;
                                        btyq.f152969b = j2;
                                        float f = buem.f153611b;
                                        int i12 = i11 | 2;
                                        btyq.f152968a = i12;
                                        btyq.f152970c = f;
                                        float f2 = buem.f153612c;
                                        int i13 = i12 | 4;
                                        btyq.f152968a = i13;
                                        btyq.f152971d = f2;
                                        float f3 = buem.f153613d;
                                        int i14 = i13 | 8;
                                        btyq.f152968a = i14;
                                        btyq.f152972e = f3;
                                        long j3 = buem.f153614e;
                                        btyq.f152968a = i14 | 16;
                                        btyq.f152973f = j3;
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        btyp btyp2 = (btyp) da3.f164949b;
                                        btyq btyq2 = (btyq) da4.mo74062i();
                                        btyq2.getClass();
                                        if (!btyp2.f152965c.mo73666a()) {
                                            btyp2.f152965c = bxvk.m124021a(btyp2.f152965c);
                                        }
                                        btyp2.f152965c.add(btyq2);
                                    }
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    btyk btyk3 = (btyk) da2.f164949b;
                                    btyp btyp3 = (btyp) da3.mo74062i();
                                    btyp3.getClass();
                                    btyk3.f152934c = btyp3;
                                    btyk3.f152933b = 3;
                                }
                                btyk btyk4 = (btyk) da2.mo74062i();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                btxm btxm = (btxm) da.f164949b;
                                btyk4.getClass();
                                btxm.f152828m = btyk4;
                                btxm.f152816a |= 8192;
                                m99050a((btxm) da.mo74062i(), 16);
                                return;
                            }
                            throw null;
                        }
                    } else if (cetp.m138232b()) {
                        budx budx5 = bueb.f153564d;
                        if (budx5 != null) {
                            budx2 = budx5;
                        } else {
                            budx2 = budx.f153536m;
                        }
                        m99051a(budx2, bueb.f153565e, System.currentTimeMillis(), bugr.mo72647c(), false, true);
                    }
                }
            }
        }
    }
}
