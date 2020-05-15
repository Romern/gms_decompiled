package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqo {

    /* renamed from: a */
    private long f62506a;

    /* renamed from: b */
    private long f62507b = 0;

    /* renamed from: c */
    private int f62508c = -1;

    /* renamed from: d */
    private final List f62509d;

    /* renamed from: e */
    private final int f62510e;

    /* renamed from: f */
    private int f62511f = 2;

    public adqo(int i) {
        this.f62510e = i;
        this.f62509d = new ArrayList();
    }

    /* renamed from: a */
    public final synchronized bomb mo33707a() {
        bxvd da;
        da = bomb.f133616f.mo74144da();
        int i = this.f62510e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bomb) da.f164949b).f133618a = i - 2;
        ((bomb) da.f164949b).f133622e = this.f62507b;
        if (this.f62508c >= 0) {
            bxvd da2 = boma.f133613b.mo74144da();
            int i2 = this.f62508c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((boma) da2.f164949b).f133615a = i2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boma boma = (boma) da2.mo74062i();
            boma.getClass();
            ((bomb) da.f164949b).f133620c = boma;
        }
        int i3 = this.f62511f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomb bomb = (bomb) da.f164949b;
        if (i3 != 1) {
            bomb.f133619b = i3 - 2;
            ArrayList arrayList = new ArrayList();
            List list = this.f62509d;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(((adqt) list.get(i4)).mo33725a());
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bomb bomb2 = (bomb) da.f164949b;
            if (!bomb2.f133621d.mo73666a()) {
                bomb2.f133621d = bxvk.m124021a(bomb2.f133621d);
            }
            bxsy.m123078a(arrayList, bomb2.f133621d);
        } else {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return (bomb) da.mo74062i();
    }

    /* renamed from: a */
    public final synchronized void mo33708a(int i) {
        this.f62508c = i;
    }

    /* renamed from: b */
    public final synchronized void mo33710b() {
        if (this.f62506a > 0) {
            this.f62507b = SystemClock.elapsedRealtime() - this.f62506a;
        }
    }

    /* renamed from: b */
    public final synchronized void mo33711b(int i) {
        this.f62511f = i;
    }

    /* renamed from: c */
    public final void mo33712c() {
        this.f62506a = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final synchronized void mo33709a(adqt adqt) {
        this.f62509d.add(adqt);
    }
}
