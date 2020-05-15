package p000;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: bngk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bngk extends bngl {

    /* renamed from: a */
    Object[] f131595a;

    /* renamed from: b */
    int f131596b = 0;

    /* renamed from: c */
    boolean f131597c;

    public bngk(int i) {
        bndz.m109113a(i, "initialCapacity");
        this.f131595a = new Object[i];
    }

    /* renamed from: a */
    private final void m109316a(int i) {
        Object[] objArr = this.f131595a;
        int length = objArr.length;
        if (length < i) {
            this.f131595a = Arrays.copyOf(objArr, m109321a(length, i));
            this.f131597c = false;
        } else if (this.f131597c) {
            this.f131595a = (Object[]) objArr.clone();
            this.f131597c = false;
        }
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo67629b(Object obj) {
        throw null;
    }

    /* renamed from: a */
    public final void mo67626a(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m109316a(this.f131596b + collection.size());
            if (collection instanceof bngm) {
                this.f131596b = ((bngm) collection).mo67630a(this.f131595a, this.f131596b);
                return;
            }
        }
        super.mo67626a(iterable);
    }

    /* renamed from: a */
    public final void mo67627a(Object obj) {
        bmxy.m108581a(obj);
        m109316a(this.f131596b + 1);
        Object[] objArr = this.f131595a;
        int i = this.f131596b;
        this.f131596b = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: a */
    public final void mo67628a(Object... objArr) {
        bnnw.m109885a(objArr);
        int i = this.f131596b;
        int length = objArr.length;
        m109316a(i + length);
        System.arraycopy(objArr, 0, this.f131595a, this.f131596b, length);
        this.f131596b += length;
    }
}
