package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0918cw extends AbstractList {

    /* renamed from: a */
    public static final List f12219a = new ArrayList();

    /* renamed from: b */
    public int f12220b;

    /* renamed from: c */
    public final ArrayList f12221c;

    /* renamed from: d */
    public int f12222d;

    /* renamed from: e */
    public int f12223e;

    /* renamed from: f */
    public int f12224f;

    /* renamed from: g */
    public int f12225g;

    /* renamed from: h */
    public int f12226h;

    /* renamed from: i */
    public int f12227i;

    /* renamed from: j */
    public int f12228j;

    public C0918cw() {
        this.f12220b = 0;
        this.f12221c = new ArrayList();
        this.f12222d = 0;
        this.f12223e = 0;
        this.f12224f = 0;
        this.f12225g = 0;
        this.f12226h = 1;
        this.f12227i = 0;
        this.f12228j = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo8348a() {
        int i = this.f12220b;
        int size = this.f12221c.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) this.f12221c.get(i2);
            if (list != null && list != f12219a) {
                break;
            }
            i += this.f12226h;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo8349b() {
        int i = this.f12222d;
        for (int size = this.f12221c.size() - 1; size >= 0; size--) {
            List list = (List) this.f12221c.get(size);
            if (list != null && list != f12219a) {
                break;
            }
            i += this.f12226h;
        }
        return i;
    }

    public final Object get(int i) {
        int i2;
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
        }
        int i3 = i - this.f12220b;
        if (i3 < 0 || i3 >= this.f12225g) {
            return null;
        }
        int i4 = this.f12226h;
        if (i4 <= 0) {
            int size = this.f12221c.size();
            i2 = 0;
            while (i2 < size) {
                int size2 = ((List) this.f12221c.get(i2)).size();
                if (size2 > i3) {
                    break;
                }
                i3 -= size2;
                i2++;
            }
        } else {
            i2 = i3 / i4;
            i3 %= i4;
        }
        List list = (List) this.f12221c.get(i2);
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(i3);
    }

    public final int size() {
        return this.f12220b + this.f12225g + this.f12222d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("leading " + this.f12220b + ", storage " + this.f12225g + ", trailing " + this.f12222d);
        for (int i = 0; i < this.f12221c.size(); i++) {
            sb.append(" ");
            sb.append(this.f12221c.get(i));
        }
        return sb.toString();
    }

    public C0918cw(C0918cw cwVar) {
        this.f12220b = cwVar.f12220b;
        this.f12221c = new ArrayList(cwVar.f12221c);
        this.f12222d = cwVar.f12222d;
        this.f12223e = cwVar.f12223e;
        this.f12224f = cwVar.f12224f;
        this.f12225g = cwVar.f12225g;
        this.f12226h = cwVar.f12226h;
        this.f12227i = cwVar.f12227i;
        this.f12228j = cwVar.f12228j;
    }
}
