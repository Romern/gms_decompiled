package p000;

import android.content.Context;
import java.util.logging.FileHandler;

/* renamed from: aunv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aunv {

    /* renamed from: a */
    public static final imn f92171a = new aunt();

    /* renamed from: b */
    public final Context f92172b;

    /* renamed from: c */
    public final Object f92173c = new Object();

    /* renamed from: d */
    public FileHandler f92174d = null;

    /* renamed from: e */
    public boolean f92175e = false;

    /* renamed from: f */
    public boolean f92176f = cgzt.m147782g();

    /* renamed from: g */
    public int f92177g = 0;

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.f92173c) {
            FileHandler fileHandler = this.f92174d;
            if (fileHandler != null) {
                fileHandler.flush();
                this.f92174d.close();
            }
        }
    }

    public aunv(Context context) {
        sdo.m34959a(context);
        this.f92172b = context;
    }
}
