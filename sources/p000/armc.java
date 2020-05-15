package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: armc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class armc {

    /* renamed from: a */
    public final long f87878a = System.currentTimeMillis();

    /* renamed from: b */
    public final List f87879b = new ArrayList();

    /* renamed from: c */
    public final bxvd f87880c;

    /* renamed from: d */
    private boolean f87881d;

    /* renamed from: e */
    private final SparseArray f87882e = new SparseArray();

    public armc() {
        bxvd da = boeb.f132758u.mo74144da();
        this.f87880c = da;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boeb boeb = (boeb) da.f164949b;
        boeb.f132760a |= 4096;
        boeb.f132772m = 2;
        bxvd bxvd = this.f87880c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boeb boeb2 = (boeb) bxvd.f164949b;
        boeb2.f132760a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boeb2.f132775p = 0;
        bxvd bxvd2 = this.f87880c;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        boeb boeb3 = (boeb) bxvd2.f164949b;
        boeb3.f132760a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        boeb3.f132776q = 0;
    }

    /* renamed from: b */
    private final int m73099b(int i) {
        ArrayList arrayList = (ArrayList) this.f87882e.get(i);
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final synchronized boeb mo48628a(Context context, long j) {
        if (this.f87881d) {
            return null;
        }
        int b = m73099b(9);
        int b2 = m73099b(10) + m73099b(11);
        int b3 = m73099b(12);
        bxvd bxvd = this.f87880c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boeb boeb = (boeb) bxvd.f164949b;
        boeb boeb2 = boeb.f132758u;
        boeb.f132760a |= 512;
        boeb.f132768i = b2;
        bxvd bxvd2 = this.f87880c;
        int i = b2 + b;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        boeb boeb3 = (boeb) bxvd2.f164949b;
        boeb3.f132760a |= 64;
        boeb3.f132765f = i;
        bxvd bxvd3 = this.f87880c;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        boeb boeb4 = (boeb) bxvd3.f164949b;
        boeb4.f132760a |= 128;
        boeb4.f132766g = b;
        bxvd bxvd4 = this.f87880c;
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        boeb boeb5 = (boeb) bxvd4.f164949b;
        boeb5.f132760a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        boeb5.f132767h = b3;
        bxvd bxvd5 = this.f87880c;
        if (bxvd5.f164950c) {
            bxvd5.mo74035c();
            bxvd5.f164950c = false;
        }
        ((boeb) bxvd5.f164949b).f132769j = bxvk.m124028dc();
        List list = this.f87879b;
        if (bxvd5.f164950c) {
            bxvd5.mo74035c();
            bxvd5.f164950c = false;
        }
        boeb boeb6 = (boeb) bxvd5.f164949b;
        if (!boeb6.f132769j.mo73666a()) {
            boeb6.f132769j = bxvk.m124019a(boeb6.f132769j);
        }
        bxsy.m123078a(list, boeb6.f132769j);
        bxvd bxvd6 = this.f87880c;
        if (bxvd6.f164950c) {
            bxvd6.mo74035c();
            bxvd6.f164950c = false;
        }
        boeb boeb7 = (boeb) bxvd6.f164949b;
        boeb7.f132760a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        boeb7.f132774o = j;
        if (m73099b(15) <= 0) {
            bxvd bxvd7 = this.f87880c;
            if (bxvd7.f164950c) {
                bxvd7.mo74035c();
                bxvd7.f164950c = false;
            }
            boeb boeb8 = (boeb) bxvd7.f164949b;
            boeb8.f132760a |= 1024;
            boeb8.f132770k = false;
        } else {
            bxvd bxvd8 = this.f87880c;
            if (bxvd8.f164950c) {
                bxvd8.mo74035c();
                bxvd8.f164950c = false;
            }
            boeb boeb9 = (boeb) bxvd8.f164949b;
            boeb9.f132760a |= 1024;
            boeb9.f132770k = true;
            if (m73099b(13) > 0) {
                bxvd bxvd9 = this.f87880c;
                if (bxvd9.f164950c) {
                    bxvd9.mo74035c();
                    bxvd9.f164950c = false;
                }
                boeb boeb10 = (boeb) bxvd9.f164949b;
                boeb10.f132760a |= 2048;
                boeb10.f132771l = 1;
            }
        }
        bxvd bxvd10 = this.f87880c;
        long currentTimeMillis = System.currentTimeMillis() - this.f87878a;
        if (bxvd10.f164950c) {
            bxvd10.mo74035c();
            bxvd10.f164950c = false;
        }
        boeb boeb11 = (boeb) bxvd10.f164949b;
        boeb11.f132760a |= 2;
        boeb11.f132761b = currentTimeMillis;
        boeb boeb12 = (boeb) this.f87880c.mo74062i();
        bxvd da = boct.f132600I.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boct boct = (boct) da.f164949b;
        boct.f132612c = 6;
        int i2 = boct.f132610a | 1;
        boct.f132610a = i2;
        boeb12.getClass();
        boct.f132618i = boeb12;
        boct.f132610a = i2 | 64;
        new qws(context, "ANDROID_AUTH", null).mo24335a(((boct) da.mo74062i()).mo73642k()).mo24327b();
        this.f87881d = true;
        return boeb12;
    }

    /* renamed from: b */
    public final void mo48632b() {
        bxvd bxvd = this.f87880c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boeb boeb = (boeb) bxvd.f164949b;
        boeb boeb2 = boeb.f132758u;
        boeb.f132760a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        boeb.f132777r = true;
    }

    /* renamed from: a */
    public final void mo48629a() {
        bxvd bxvd = this.f87880c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boeb boeb = (boeb) bxvd.f164949b;
        boeb boeb2 = boeb.f132758u;
        boeb.f132760a |= 16;
        boeb.f132763d = true;
    }

    /* renamed from: a */
    public final void mo48630a(int i) {
        ArrayList arrayList = (ArrayList) this.f87882e.get(i);
        if (arrayList != null) {
            arrayList.add(Long.valueOf(SystemClock.elapsedRealtime()));
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(SystemClock.elapsedRealtime()));
        this.f87882e.put(i, arrayList2);
    }

    /* renamed from: a */
    public final void mo48631a(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            mo48630a(i);
        }
    }
}
