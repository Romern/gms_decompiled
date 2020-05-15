package p000;

import android.os.AsyncTask;
import java.util.List;

/* renamed from: aaru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aaru extends AsyncTask {

    /* renamed from: a */
    protected final aate f56399a;

    /* renamed from: b */
    public boolean f56400b;

    /* renamed from: c */
    public boolean f56401c = false;

    /* renamed from: d */
    public Object f56402d = null;

    public aaru(aate aate) {
        this.f56399a = aate;
    }

    /* renamed from: a */
    public static void m46808a(boolean z, List list) {
        int size = list.size();
        int size2 = list.size();
        aaru[] aaruArr = new aaru[size2];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            aaru aaru = (aaru) list.get(i3);
            if (!z || aaru.mo31663b()) {
                aaruArr[i2] = aaru;
                i2++;
            }
        }
        while (i < size2) {
            aaru aaru2 = aaruArr[i];
            if (aaru2 != null) {
                aaru2.mo31664c();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31660a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo31662b(Object obj) {
    }

    /* renamed from: b */
    public boolean mo31663b() {
        return false;
    }

    /* renamed from: c */
    public final void mo31664c() {
        try {
            cancel(false);
        } finally {
            this.f56399a.mo31769b(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPostExecute(Object obj) {
        if (this.f56401c) {
            this.f56402d = obj;
        } else {
            mo31661a(obj);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        this.f56399a.mo31768a(this);
        mo31660a();
    }

    /* renamed from: a */
    public final void mo31661a(Object obj) {
        try {
            this.f56400b = true;
            mo31662b(obj);
        } finally {
            this.f56399a.mo31769b(this);
        }
    }
}
