package p000;

import android.content.ContentProviderOperation;
import java.util.ArrayList;

/* renamed from: amwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwn {

    /* renamed from: a */
    private ArrayList f76199a = new ArrayList();

    /* renamed from: b */
    private ContentProviderOperation.Builder f76200b;

    /* renamed from: c */
    private int f76201c;

    /* renamed from: a */
    private final int m63550a(ContentProviderOperation.Builder builder) {
        this.f76201c++;
        int d = mo41500d();
        ContentProviderOperation.Builder builder2 = this.f76200b;
        if (builder2 != null) {
            this.f76199a.add(builder2.build());
        }
        this.f76200b = builder;
        return d;
    }

    /* renamed from: b */
    public final synchronized ArrayList mo41498b() {
        ArrayList arrayList;
        arrayList = this.f76199a;
        ContentProviderOperation.Builder builder = this.f76200b;
        if (builder != null) {
            arrayList.add(builder.build());
        }
        this.f76199a = new ArrayList();
        this.f76200b = null;
        this.f76201c = 0;
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized boolean mo41499c() {
        return this.f76200b == null;
    }

    /* renamed from: d */
    public final synchronized int mo41500d() {
        return !mo41499c() ? this.f76199a.size() + 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        return r3;
     */
    /* renamed from: a */
    public final synchronized int mo41496a(ContentProviderOperation.Builder builder, boolean z) {
        int i;
        bmxy.m108581a(builder);
        if (z) {
            i = m63550a(builder);
            mo41497a();
        } else {
            i = m63550a(builder);
            amig.m62939a();
            if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82974al()).booleanValue()) {
                if (this.f76201c >= Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82944aH()).intValue()) {
                    mo41497a();
                    return i;
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo41497a() {
        ContentProviderOperation.Builder builder = this.f76200b;
        if (builder != null) {
            builder.withYieldAllowed(true);
            this.f76201c = 0;
        }
    }
}
