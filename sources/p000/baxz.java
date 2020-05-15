package p000;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: baxz */
final /* synthetic */ class baxz implements bmxj {

    /* renamed from: a */
    private final bayg f102074a;

    public baxz(bayg bayg) {
        this.f102074a = bayg;
    }

    public final Object apply(Object obj) {
        int i;
        bayg bayg = this.f102074a;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : (List) obj) {
            arrayList.add((bavd) pair.second);
        }
        arrayList.addAll(bayg.f102087b.mo56058c());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            bavd bavd = (bavd) arrayList.get(i2);
            bxwc bxwc = bavd.f101880j;
            int size2 = bxwc.size();
            int i3 = 0;
            while (true) {
                i = i2 + 1;
                if (i3 >= size2) {
                    break;
                }
                bauy bauy = (bauy) bxwc.get(i3);
                Context context = bayg.f102086a;
                int a = bavb.m87594a(bavd.f101876f);
                if (a == 0) {
                    a = 1;
                }
                bawt bawt = bayg.f102093h;
                bxvd da = bavt.f101927g.mo74144da();
                String b = bbfe.m87923b(bauy);
                bbba bbba = bbba.NEW_FILE_KEY;
                int ordinal = bbbb.m87767a(context, bawt).ordinal();
                if (ordinal == 0) {
                    String str = bauy.f101851c;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bavt bavt = (bavt) da.f164949b;
                    str.getClass();
                    int i4 = bavt.f101929a | 1;
                    bavt.f101929a = i4;
                    bavt.f101930b = str;
                    int i5 = bauy.f101852d;
                    int i6 = 2 | i4;
                    bavt.f101929a = i6;
                    bavt.f101931c = i5;
                    b.getClass();
                    int i7 = i6 | 4;
                    bavt.f101929a = i7;
                    bavt.f101932d = b;
                    bavt.f101933e = a - 1;
                    bavt.f101929a = i7 | 8;
                } else if (ordinal == 1) {
                    String str2 = bauy.f101851c;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bavt bavt2 = (bavt) da.f164949b;
                    str2.getClass();
                    int i8 = bavt2.f101929a | 1;
                    bavt2.f101929a = i8;
                    bavt2.f101930b = str2;
                    int i9 = bauy.f101852d;
                    int i10 = i8 | 2;
                    bavt2.f101929a = i10;
                    bavt2.f101931c = i9;
                    b.getClass();
                    int i11 = i10 | 4;
                    bavt2.f101929a = i11;
                    bavt2.f101932d = b;
                    bavt2.f101933e = a - 1;
                    bavt2.f101929a = i11 | 8;
                    if ((bauy.f101849a & 32) != 0) {
                        bzny bzny = bauy.f101855g;
                        if (bzny == null) {
                            bzny = bzny.f170777b;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bavt bavt3 = (bavt) da.f164949b;
                        bzny.getClass();
                        bavt3.f101934f = bzny;
                        bavt3.f101929a |= 16;
                    }
                } else if (ordinal == 2) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bavt bavt4 = (bavt) da.f164949b;
                    b.getClass();
                    int i12 = bavt4.f101929a | 4;
                    bavt4.f101929a = i12;
                    bavt4.f101932d = b;
                    bavt4.f101933e = a - 1;
                    bavt4.f101929a = i12 | 8;
                }
                hashSet.add((bavt) da.mo74062i());
                i3++;
            }
            i2 = i;
        }
        return hashSet;
    }
}
