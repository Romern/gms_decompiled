package p000;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: bqxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqxc extends bqxu implements bqww {

    /* renamed from: h */
    private boolean f141800h = true;

    protected bqxc(bobl bobl, bqwu bqwu) {
        super(bqwx.m113586b(bobl), bqwu);
    }

    /* renamed from: g */
    private final boolean m113602g() {
        if (this.f141800h && mo69455e().equals("string")) {
            TreeSet treeSet = new TreeSet();
            for (bqxt bqxt : this.f141922g.values()) {
                if (bqxt.mo69451j()) {
                    return false;
                }
                bqxo d = bqxt.mo69389d();
                bmxy.m108581a(d);
                bqxn b = d.mo69373b();
                if (b != bqxn.STRING && b != bqxn.REFERENCE) {
                    return false;
                }
                treeSet.add(Integer.valueOf(bqxt.mo69387b()));
            }
            if (treeSet.size() == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo69401a() {
        this.f141800h = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final short mo69398b() {
        return (short) (m113602g() ? bqwt.TABLE_TYPE.f141785q | 4096 : bqwt.TABLE_TYPE.f141785q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69396a(DataOutput dataOutput, ByteBuffer byteBuffer) {
        boolean z;
        if (m113602g()) {
            ArrayList arrayList = new ArrayList();
            TreeSet treeSet = new TreeSet();
            int i = 0;
            for (int i2 = 0; i2 < this.f141920e; i2++) {
                Map map = this.f141922g;
                Integer valueOf = Integer.valueOf(i2);
                if (map.containsKey(valueOf)) {
                    bqxt bqxt = (bqxt) this.f141922g.get(valueOf);
                    bmxy.m108581a(bqxt);
                    treeSet.add(Integer.valueOf(bqxt.mo69387b()));
                    boolean z2 = true;
                    if (bqxt.mo69451j() || treeSet.size() != 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    bmxy.m108600b(z);
                    bqxo d = bqxt.mo69389d();
                    bmxy.m108581a(d);
                    if (!(d.mo69373b() == bqxn.STRING || d.mo69373b() == bqxn.REFERENCE)) {
                        z2 = false;
                    }
                    bmxy.m108600b(z2);
                    if (d.mo69373b() == bqxn.REFERENCE) {
                        arrayList.add(-3);
                    }
                    int c = d.mo69374c();
                    if (c == 0) {
                        c = -2;
                    }
                    arrayList.add(Integer.valueOf(c));
                    int c2 = bqxt.mo69388c();
                    arrayList.add(Integer.valueOf(c2 - i));
                    i = c2;
                } else {
                    arrayList.add(0);
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            btue.m117148a(arrayList.size(), byteArrayOutputStream);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                btue.m117148a(((Integer) arrayList.get(i3)).intValue(), byteArrayOutputStream);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            dataOutput.writeInt(((Integer) bnjd.m109587b(treeSet)).intValue());
            dataOutput.write(byteArray);
            bqwu.m113573a(dataOutput, byteArray.length);
            return;
        }
        super.mo69396a(dataOutput, byteBuffer);
    }
}
