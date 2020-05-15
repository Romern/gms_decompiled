package com.google.android.setupdesign.items;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ItemGroup extends AbstractItemHierarchy implements bizq, bizo {

    /* renamed from: a */
    public final List f151508a = new ArrayList();

    /* renamed from: b */
    public boolean f151509b = false;

    /* renamed from: d */
    private final SparseIntArray f151510d = new SparseIntArray();

    /* renamed from: e */
    private int f151511e = 0;

    public ItemGroup() {
    }

    /* renamed from: a */
    public static int m117889a(List list, Object obj) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == obj) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private final int m117890b(bizp bizp) {
        return mo71400d(m117889a(this.f151508a, bizp));
    }

    /* renamed from: cB */
    public final void mo64911cB() {
        this.f151509b = true;
        mo71388i();
    }

    /* renamed from: d */
    public final int mo71400d(int i) {
        m117891b();
        if (i == -1) {
            return -1;
        }
        int size = this.f151508a.size();
        int i2 = -1;
        while (i2 < 0 && i < size) {
            i2 = this.f151510d.get(i, -1);
            i++;
        }
        return i2 < 0 ? mo64923g() : i2;
    }

    /* renamed from: g */
    public final int mo64923g() {
        m117891b();
        return this.f151511e;
    }

    /* renamed from: b */
    private final void m117891b() {
        if (this.f151509b) {
            this.f151511e = 0;
            this.f151510d.clear();
            for (int i = 0; i < this.f151508a.size(); i++) {
                bizp bizp = (bizp) this.f151508a.get(i);
                if (bizp.mo64923g() > 0) {
                    this.f151510d.put(i, this.f151511e);
                }
                this.f151511e += bizp.mo64923g();
            }
            this.f151509b = false;
        }
    }

    public ItemGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final bizl mo64919a(int i) {
        int keyAt;
        m117891b();
        if (i < 0 || i >= this.f151511e) {
            int i2 = this.f151511e;
            StringBuilder sb = new StringBuilder(35);
            sb.append("size=");
            sb.append(i2);
            sb.append("; index=");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        SparseIntArray sparseIntArray = this.f151510d;
        int size = sparseIntArray.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                int valueAt = sparseIntArray.valueAt(i4);
                if (valueAt >= i) {
                    if (valueAt <= i) {
                        keyAt = sparseIntArray.keyAt(i4);
                        break;
                    }
                    size = i4 - 1;
                } else {
                    i3 = i4 + 1;
                }
            } else {
                keyAt = sparseIntArray.keyAt(i3 - 1);
                break;
            }
        }
        if (keyAt >= 0) {
            return ((bizp) this.f151508a.get(keyAt)).mo64919a(i - this.f151510d.get(keyAt));
        }
        throw new IllegalStateException("Cannot have item start index < 0");
    }

    /* renamed from: b */
    public final bizp mo64921b(int i) {
        if (i == this.f151489c) {
            return this;
        }
        List list = this.f151508a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            bizp b = ((bizp) list.get(i2)).mo64921b(i);
            i2++;
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo58968b(bizp bizp, int i, int i2) {
        this.f151509b = true;
        int b = m117890b(bizp);
        if (b >= 0) {
            mo71385a(b + i, i2);
            return;
        }
        String valueOf = String.valueOf(bizp);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child insert ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }

    /* renamed from: a */
    public void mo58966a(bizp bizp) {
        this.f151509b = true;
        this.f151508a.add(bizp);
        bizp.mo64920a(this);
        int g = bizp.mo64923g();
        if (g > 0) {
            mo71385a(m117890b(bizp), g);
        }
    }

    /* renamed from: a */
    public final void mo64910a(bizp bizp, int i) {
        int b = m117890b(bizp);
        if (b >= 0) {
            mo71387c(b + i);
            return;
        }
        String valueOf = String.valueOf(bizp);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child change ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }

    /* renamed from: a */
    public void mo58967a(bizp bizp, int i, int i2) {
        this.f151509b = true;
        int b = m117890b(bizp);
        if (b >= 0) {
            mo71386b(b + i, i2);
            return;
        }
        String valueOf = String.valueOf(bizp);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child remove ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }
}
