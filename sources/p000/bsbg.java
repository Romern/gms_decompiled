package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bsbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsbg {

    /* renamed from: a */
    final /* synthetic */ bsbh f143933a;

    /* renamed from: b */
    private int f143934b = 0;

    /* renamed from: c */
    private int f143935c = Integer.MIN_VALUE;

    /* renamed from: d */
    private Iterator f143936d = null;

    public bsbg(bsbh bsbh) {
        this.f143933a = bsbh;
    }

    /* renamed from: a */
    public final boolean mo70163a() {
        if (this.f143935c != Integer.MIN_VALUE) {
            return true;
        }
        if (this.f143934b <= this.f143933a.f143939c) {
            while (true) {
                int i = this.f143934b;
                bsbh bsbh = this.f143933a;
                if (i > bsbh.f143939c) {
                    break;
                } else if (bsbh.f143937a[i] == null) {
                    this.f143934b = i + 1;
                } else {
                    this.f143934b = i + 1;
                    this.f143935c = i;
                    return true;
                }
            }
        }
        HashMap hashMap = this.f143933a.f143938b;
        if (hashMap == null) {
            return false;
        }
        if (this.f143936d == null) {
            this.f143936d = hashMap.keySet().iterator();
        }
        if (!this.f143936d.hasNext()) {
            return false;
        }
        this.f143935c = ((Integer) this.f143936d.next()).intValue();
        return true;
    }

    /* renamed from: b */
    public final int mo70164b() {
        if (mo70163a()) {
            int i = this.f143935c;
            this.f143935c = Integer.MIN_VALUE;
            return i;
        }
        throw new NoSuchElementException();
    }
}
