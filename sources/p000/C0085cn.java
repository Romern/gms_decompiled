package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0085cn {

    /* renamed from: a */
    final /* synthetic */ C0072cb f7095a;

    C0085cn() {
    }

    /* renamed from: a */
    public final void mo3995a(int i, C0086co coVar) {
        if (coVar == C0086co.f7129b) {
            this.f7095a.mo8249i();
        } else if (!this.f7095a.mo8248h()) {
            List list = coVar.f7130c;
            boolean z = true;
            if (i == 0) {
                C0072cb cbVar = this.f7095a;
                C0918cw cwVar = cbVar.f11998l;
                int i2 = coVar.f7131d;
                int i3 = coVar.f7132e;
                int i4 = coVar.f7133f;
                cwVar.f12220b = 0;
                cwVar.f12221c.clear();
                cwVar.f12221c.add(list);
                cwVar.f12222d = 0;
                cwVar.f12223e = 0;
                int size = list.size();
                cwVar.f12224f = size;
                cwVar.f12225g = size;
                cwVar.f12226h = list.size();
                cwVar.f12227i = 0;
                cwVar.f12228j = 0;
                cbVar.mo8240a(0, cwVar.size());
                C0918cw cwVar2 = cbVar.f11998l;
                if (cwVar2.f12220b <= 0 && cwVar2.f12222d <= 0) {
                    z = false;
                }
                cbVar.f6376f = z;
                C0072cb cbVar2 = this.f7095a;
                if (cbVar2.f11999m == -1) {
                    int i5 = coVar.f7131d;
                    int i6 = coVar.f7133f;
                    cbVar2.f11999m = list.size() / 2;
                    return;
                }
                return;
            }
            C0072cb cbVar3 = this.f7095a;
            int i7 = cbVar3.f11999m;
            C0918cw cwVar3 = cbVar3.f11998l;
            int i8 = cwVar3.f12220b;
            int i9 = cwVar3.f12223e;
            int i10 = cwVar3.f12225g;
            boolean z2 = cbVar3.f6377g;
            if (i != 1) {
                int size2 = list.size();
                if (size2 != 0) {
                    int i11 = cwVar3.f12226h;
                    if (i11 > 0 && size2 != i11) {
                        if (cwVar3.f12221c.size() != 1 || size2 <= cwVar3.f12226h) {
                            cwVar3.f12226h = -1;
                        } else {
                            cwVar3.f12226h = size2;
                        }
                    }
                    cwVar3.f12221c.add(0, list);
                    cwVar3.f12224f += size2;
                    cwVar3.f12225g += size2;
                    int min = Math.min(cwVar3.f12220b, size2);
                    int i12 = size2 - min;
                    if (min != 0) {
                        cwVar3.f12220b -= min;
                    }
                    cwVar3.f12223e -= i12;
                    cwVar3.f12227i += size2;
                    int i13 = cwVar3.f12220b;
                    int i14 = (cbVar3.f6374d - min) - i12;
                    cbVar3.f6374d = i14;
                    cbVar3.f6372b = 0;
                    if (i14 > 0) {
                        cbVar3.mo3636a();
                    }
                    cbVar3.mo8244b(i13, min);
                    cbVar3.mo8240a(0, i12);
                    cbVar3.f11999m += i12;
                    cbVar3.f12000n += i12;
                    cbVar3.f12001o += i12;
                } else {
                    cbVar3.f6372b = 2;
                }
            } else {
                int size3 = list.size();
                if (size3 != 0) {
                    if (cwVar3.f12226h > 0) {
                        ArrayList arrayList = cwVar3.f12221c;
                        int size4 = ((List) arrayList.get(arrayList.size() - 1)).size();
                        int i15 = cwVar3.f12226h;
                        if (size4 != i15 || size3 > i15) {
                            cwVar3.f12226h = -1;
                        }
                    }
                    cwVar3.f12221c.add(list);
                    cwVar3.f12224f += size3;
                    cwVar3.f12225g += size3;
                    int min2 = Math.min(cwVar3.f12222d, size3);
                    int i16 = size3 - min2;
                    if (min2 != 0) {
                        cwVar3.f12222d -= min2;
                    }
                    cwVar3.f12228j += size3;
                    int i17 = (cwVar3.f12220b + cwVar3.f12225g) - size3;
                    int i18 = (cbVar3.f6375e - min2) - i16;
                    cbVar3.f6375e = i18;
                    cbVar3.f6373c = 0;
                    if (i18 > 0) {
                        cbVar3.mo3639b();
                    }
                    cbVar3.mo8244b(i17, min2);
                    cbVar3.mo8240a(i17 + min2, i16);
                } else {
                    cbVar3.f6373c = 2;
                }
            }
            boolean z3 = this.f7095a.f6377g;
        }
    }

    public C0085cn(C0072cb cbVar) {
        this.f7095a = cbVar;
    }
}
