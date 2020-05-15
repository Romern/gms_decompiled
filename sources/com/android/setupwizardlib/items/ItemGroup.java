package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ItemGroup extends AbstractItemHierarchy implements bme, bmc {

    /* renamed from: b */
    private final List f7223b = new ArrayList();

    /* renamed from: c */
    private final SparseIntArray f7224c = new SparseIntArray();

    /* renamed from: d */
    private int f7225d = 0;

    /* renamed from: e */
    private boolean f7226e = false;

    public ItemGroup() {
    }

    /* renamed from: b */
    private final int m4726b(bmd bmd) {
        List list = this.f7223b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (list.get(i) == bmd) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        m4727b();
        if (i == -1) {
            return -1;
        }
        int size2 = this.f7223b.size();
        int i2 = -1;
        while (i2 < 0 && i < size2) {
            i2 = this.f7224c.get(i, -1);
            i++;
        }
        if (i2 >= 0) {
            return i2;
        }
        return mo3269a();
    }

    /* renamed from: a */
    public final int mo3269a() {
        m4727b();
        return this.f7225d;
    }

    /* renamed from: c */
    public final bmd mo3272c() {
        if (this.f7206a == C0126R.C0129id.android_auto_item) {
            return this;
        }
        List list = this.f7223b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            bmd c = ((bmd) list.get(i)).mo3272c();
            i++;
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final bmb mo3270a(int i) {
        int keyAt;
        m4727b();
        if (i < 0 || i >= this.f7225d) {
            int i2 = this.f7225d;
            StringBuilder sb = new StringBuilder(35);
            sb.append("size=");
            sb.append(i2);
            sb.append("; index=");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        SparseIntArray sparseIntArray = this.f7224c;
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
            return ((bmd) this.f7223b.get(keyAt)).mo3270a(i - this.f7224c.get(keyAt));
        }
        throw new IllegalStateException("Cannot have item start index < 0");
    }

    public ItemGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    private final void m4727b() {
        if (this.f7226e) {
            this.f7225d = 0;
            this.f7224c.clear();
            for (int i = 0; i < this.f7223b.size(); i++) {
                bmd bmd = (bmd) this.f7223b.get(i);
                if (bmd.mo3269a() > 0) {
                    this.f7224c.put(i, this.f7225d);
                }
                this.f7225d += bmd.mo3269a();
            }
            this.f7226e = false;
        }
    }

    /* renamed from: b */
    public final void mo3268b(bmd bmd, int i) {
        this.f7226e = true;
        int b = m4726b(bmd);
        if (b >= 0) {
            mo4092c(b + i);
            return;
        }
        String valueOf = String.valueOf(bmd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child remove ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }

    /* renamed from: a */
    public final void mo3273a(bmd bmd) {
        this.f7226e = true;
        this.f7223b.add(bmd);
        bmd.mo3271a(this);
        int a = bmd.mo3269a();
        if (a > 0) {
            mo4090a(m4726b(bmd), a);
        }
    }

    /* renamed from: a */
    public final void mo3266a(bmd bmd, int i) {
        int b = m4726b(bmd);
        if (b >= 0) {
            mo4091b(b + i);
            return;
        }
        String valueOf = String.valueOf(bmd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child change ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }

    /* renamed from: a */
    public final void mo3267a(bmd bmd, int i, int i2) {
        this.f7226e = true;
        int b = m4726b(bmd);
        if (b >= 0) {
            mo4090a(b + i, i2);
            return;
        }
        String valueOf = String.valueOf(bmd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Unexpected child insert ");
        sb.append(valueOf);
        Log.e("ItemGroup", sb.toString());
    }
}
