package p000;

/* renamed from: cavc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cavc implements Runnable {

    /* renamed from: a */
    protected final String f176117a;

    public cavc(String str, Object... objArr) {
        this.f176117a = String.format(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo74949a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f176117a);
        try {
            mo74949a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
