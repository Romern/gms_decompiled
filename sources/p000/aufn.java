package p000;

import android.location.Location;
import com.google.android.gms.thunderbird.EmergencyLocationChimeraService;
import com.google.android.gms.thunderbird.state.DeviceState;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: aufn */
final /* synthetic */ class aufn implements bmxj {

    /* renamed from: a */
    private final EmergencyLocationChimeraService f91699a;

    public aufn(EmergencyLocationChimeraService emergencyLocationChimeraService) {
        this.f91699a = emergencyLocationChimeraService;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List, java.util.Collection], assign insn: 0x0361: IGET  (r5v6 ? I:java.util.Collection) = (r13v6 auiq) auiq.c java.util.Collection */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0274  */
    public final Object apply(Object obj) {
        auit auit;
        char c;
        int size;
        Location location;
        int i;
        int size2;
        int i2;
        bxvd da;
        int i3;
        boolean z;
        auit auit2;
        int i4;
        List list;
        auit auit3;
        int i5;
        int i6;
        List list2;
        List list3;
        auit auit4;
        auit auit5;
        long j;
        List list4;
        EmergencyLocationChimeraService emergencyLocationChimeraService = this.f91699a;
        auit auit6 = (auit) obj;
        List list5 = auit6.f91916e;
        int size3 = list5.size();
        boolean z2 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                auit = auit6;
                break;
            }
            auiq auiq = (auiq) list5.get(i7);
            int i8 = auiq.f91900f;
            int i9 = 4;
            boolean z3 = true;
            bmxy.m108600b(i8 != 4 ? i8 == 5 : true);
            i7++;
            if (auiq.mo50565e()) {
                z2 = false;
            } else if (Math.random() < cgyq.f188062a.mo6606a().mo84764h()) {
                bxvd da2 = bokz.f133479h.mo74144da();
                bxvd da3 = bolb.f133489f.mo74144da();
                String a = auit6.f91917f.mo59537a();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = z2;
                }
                bolb bolb = (bolb) da3.f164949b;
                a.getClass();
                bolb.f133491a |= 1;
                bolb.f133492b = a;
                boolean c2 = auit6.f91917f.mo59539c();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = z2;
                }
                bolb bolb2 = (bolb) da3.f164949b;
                int i10 = 2;
                bolb2.f133491a |= 2;
                bolb2.f133493c = c2;
                long d = auit6.f91917f.mo59540d();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = z2;
                }
                bolb bolb3 = (bolb) da3.f164949b;
                bolb3.f133491a |= 8;
                bolb3.f133495e = d;
                String b = auit6.f91917f.mo59538b();
                int hashCode = b.hashCode();
                if (hashCode != 82233) {
                    if (hashCode == 2060894 && b.equals("CALL")) {
                        c = 0;
                        if (c == 0) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = z2;
                            }
                            bolb bolb4 = (bolb) da3.f164949b;
                            bolb4.f133494d = 1;
                            bolb4.f133491a |= 4;
                        } else if (c != 1) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = z2;
                            }
                            bolb bolb5 = (bolb) da3.f164949b;
                            bolb5.f133494d = z2 ? 1 : 0;
                            bolb5.f133491a |= 4;
                        } else {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = z2;
                            }
                            bolb bolb6 = (bolb) da3.f164949b;
                            bolb6.f133494d = 2;
                            bolb6.f133491a |= 4;
                        }
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = z2;
                        }
                        bokz bokz = (bokz) da2.f164949b;
                        bolb bolb7 = (bolb) da3.mo74062i();
                        bolb7.getClass();
                        bokz.f133483c = bolb7;
                        bokz.f133481a |= 2;
                        if (auit6.f91918g) {
                            bxvd da4 = bokx.f133471c.mo74144da();
                            int i11 = auit6.f91919h;
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = z2;
                            }
                            bokx bokx = (bokx) da4.f164949b;
                            bokx.f133473a |= 1;
                            bokx.f133474b = i11;
                            bokx bokx2 = (bokx) da4.mo74062i();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = z2;
                            }
                            bokz bokz2 = (bokz) da2.f164949b;
                            bokx2.getClass();
                            bokz2.f133487g = bokx2;
                            bokz2.f133481a |= 16;
                        }
                        List list6 = auit6.f91916e;
                        size = list6.size();
                        location = null;
                        for (i = 0; i < size; i++) {
                            Location location2 = ((auiq) list6.get(i)).f91901g;
                            if (location == null || (location2 != null && auho.m77068a(location2) < auho.m77068a(location))) {
                                location = location2;
                            }
                        }
                        if (location != null) {
                            bold c3 = auit6.mo50575c(location);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = z2;
                            }
                            bokz bokz3 = (bokz) da2.f164949b;
                            c3.getClass();
                            bokz3.f133486f = c3;
                            bokz3.f133481a |= 8;
                        } else {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = z2;
                            }
                            bokz bokz4 = (bokz) da2.f164949b;
                            bokz4.f133486f = null;
                            bokz4.f133481a &= -9;
                        }
                        ((bokz) da2.f164949b).f133484d = GeneratedMessageLite.m124030de();
                        List list7 = auit6.f91916e;
                        size2 = list7.size();
                        i2 = 0;
                        while (i2 < size2) {
                            auiq auiq2 = (auiq) list7.get(i2);
                            if (!auiq2.mo50565e()) {
                                bxvd da5 = bokw.f133464f.mo74144da();
                                String str = auiq2.f91895a.f91719a;
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = z2;
                                }
                                bokw bokw = (bokw) da5.f164949b;
                                str.getClass();
                                boolean z4 = bokw.f133466a | z3;
                                bokw.f133466a = z4 ? 1 : 0;
                                bokw.f133467b = str;
                                boolean z5 = auiq2.f91895a.f91720b;
                                bokw.f133466a = z4 | i10 ? 1 : 0;
                                bokw.f133468c = z5;
                                List list8 = auiq2.f91899e.f109087b;
                                int size4 = list8.size();
                                int i12 = 0;
                                while (i12 < size4) {
                                    DeviceState deviceState = (DeviceState) list8.get(i12);
                                    bxvd da6 = bokv.f133458e.mo74144da();
                                    String str2 = deviceState.f109084h;
                                    if (str2 == null) {
                                        list4 = list8;
                                    } else {
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        bokv bokv = (bokv) da6.f164949b;
                                        str2.getClass();
                                        list4 = list8;
                                        bokv.f133460a |= 1;
                                        bokv.f133461b = str2;
                                    }
                                    String str3 = deviceState.f109083g;
                                    if (str3 != null) {
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        bokv bokv2 = (bokv) da6.f164949b;
                                        str3.getClass();
                                        bokv2.f133460a |= 2;
                                        bokv2.f133462c = str3;
                                    }
                                    if (cgyq.m147647e()) {
                                        boolean z6 = deviceState.f109082f;
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        bokv bokv3 = (bokv) da6.f164949b;
                                        bokv3.f133460a |= 4;
                                        bokv3.f133463d = z6;
                                    }
                                    bokv bokv4 = (bokv) da6.mo74062i();
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bokw bokw2 = (bokw) da5.f164949b;
                                    bokv4.getClass();
                                    if (!bokw2.f133469d.mo73666a()) {
                                        bokw2.f133469d = GeneratedMessageLite.m124021a(bokw2.f133469d);
                                    }
                                    bokw2.f133469d.add(bokv4);
                                    i12++;
                                    list8 = list4;
                                }
                                ? r5 = auiq2.f91897c;
                                int size5 = r5.size();
                                int i13 = 0;
                                int i14 = 0;
                                int i15 = 0;
                                int i16 = 0;
                                List list9 = r5;
                                while (i13 < size5) {
                                    bqgg bqgg = (bqgg) list9.get(i13);
                                    if (!bqgg.isDone()) {
                                        auit4 = auit6;
                                        list2 = list9;
                                        list3 = list7;
                                        i6 = size5;
                                        i5 = size2;
                                    } else if (bqgg.isCancelled()) {
                                        auit4 = auit6;
                                        list2 = list9;
                                        list3 = list7;
                                        i6 = size5;
                                        i5 = size2;
                                    } else {
                                        try {
                                            auiu auiu = (auiu) bqga.m112780a((Future) bqgg);
                                            bxvd da7 = bolf.f133514e.mo74144da();
                                            list2 = list9;
                                            list3 = list7;
                                            try {
                                                j = auiu.f91920a;
                                                i6 = size5;
                                            } catch (ExecutionException e) {
                                                auit5 = auit6;
                                                i6 = size5;
                                                i5 = size2;
                                                i13++;
                                                list7 = list3;
                                                list9 = list2;
                                                size5 = i6;
                                                size2 = i5;
                                                auit6 = auit3;
                                            }
                                            try {
                                                if (da7.f164950c) {
                                                    da7.mo74035c();
                                                    da7.f164950c = false;
                                                }
                                                bolf bolf = (bolf) da7.f164949b;
                                                i5 = size2;
                                                try {
                                                    bolf.f133516a |= 1;
                                                    bolf.f133517b = j;
                                                    Location location3 = auiu.f91922c;
                                                    if (location3 != null) {
                                                        bold c4 = auiu.mo50575c(location3);
                                                        if (da7.f164950c) {
                                                            da7.mo74035c();
                                                            da7.f164950c = false;
                                                        }
                                                        bolf bolf2 = (bolf) da7.f164949b;
                                                        c4.getClass();
                                                        bolf2.f133518c = c4;
                                                        bolf2.f133516a |= 2;
                                                    }
                                                    List list10 = auiu.f91921b;
                                                    if (list10 == null) {
                                                        auit3 = auit6;
                                                    } else {
                                                        Iterator it = list10.iterator();
                                                        while (it.hasNext()) {
                                                            auix auix = (auix) it.next();
                                                            bxvd da8 = bolh.f133521i.mo74144da();
                                                            String a2 = auix.f91926b.mo50499a();
                                                            if (da8.f164950c) {
                                                                da8.mo74035c();
                                                                da8.f164950c = false;
                                                            }
                                                            bolh bolh = (bolh) da8.f164949b;
                                                            a2.getClass();
                                                            Iterator it2 = it;
                                                            bolh.f133523a |= 64;
                                                            bolh.f133530h = a2;
                                                            int c5 = auix.f91926b.mo50501c();
                                                            if (da8.f164950c) {
                                                                da8.mo74035c();
                                                                da8.f164950c = false;
                                                            }
                                                            bolh bolh2 = (bolh) da8.f164949b;
                                                            int i17 = c5 - 1;
                                                            if (c5 != 0) {
                                                                bolh2.f133524b = i17;
                                                                bolh2.f133523a |= 1;
                                                                if (!auix.f91925a.f109087b.equals(((auiu) auix.f91931i).mo50574e().f109087b)) {
                                                                    bxvd da9 = bokv.f133458e.mo74144da();
                                                                    if (auix.f91925a.mo59541e().f109084h != null) {
                                                                        String str4 = auix.f91925a.mo59541e().f109084h;
                                                                        if (da9.f164950c) {
                                                                            da9.mo74035c();
                                                                            da9.f164950c = false;
                                                                        }
                                                                        bokv bokv5 = (bokv) da9.f164949b;
                                                                        str4.getClass();
                                                                        auit5 = auit6;
                                                                        try {
                                                                            try {
                                                                                bokv5.f133460a |= 1;
                                                                                bokv5.f133461b = str4;
                                                                            } catch (ExecutionException e2) {
                                                                                i13++;
                                                                                list7 = list3;
                                                                                list9 = list2;
                                                                                size5 = i6;
                                                                                size2 = i5;
                                                                                auit6 = auit3;
                                                                            }
                                                                        } catch (ExecutionException e3) {
                                                                            i13++;
                                                                            list7 = list3;
                                                                            list9 = list2;
                                                                            size5 = i6;
                                                                            size2 = i5;
                                                                            auit6 = auit3;
                                                                        }
                                                                    } else {
                                                                        auit5 = auit6;
                                                                    }
                                                                    if (auix.f91925a.mo59541e().f109083g != null) {
                                                                        String str5 = auix.f91925a.mo59541e().f109083g;
                                                                        if (da9.f164950c) {
                                                                            da9.mo74035c();
                                                                            da9.f164950c = false;
                                                                        }
                                                                        bokv bokv6 = (bokv) da9.f164949b;
                                                                        str5.getClass();
                                                                        bokv6.f133460a |= 2;
                                                                        bokv6.f133462c = str5;
                                                                    }
                                                                    if (cgyq.m147647e()) {
                                                                        boolean z7 = auix.f91925a.mo59541e().f109082f;
                                                                        if (da9.f164950c) {
                                                                            da9.mo74035c();
                                                                            da9.f164950c = false;
                                                                        }
                                                                        bokv bokv7 = (bokv) da9.f164949b;
                                                                        bokv7.f133460a |= 4;
                                                                        bokv7.f133463d = z7;
                                                                    }
                                                                    if (da8.f164950c) {
                                                                        da8.mo74035c();
                                                                        da8.f164950c = false;
                                                                    }
                                                                    bolh bolh3 = (bolh) da8.f164949b;
                                                                    bokv bokv8 = (bokv) da9.mo74062i();
                                                                    bokv8.getClass();
                                                                    bolh3.f133525c = bokv8;
                                                                    bolh3.f133523a |= 2;
                                                                } else {
                                                                    auit5 = auit6;
                                                                }
                                                                aufs aufs = auix.f91930f;
                                                                if (aufs != null) {
                                                                    boolean z8 = aufs.f91738a;
                                                                    if (da8.f164950c) {
                                                                        da8.mo74035c();
                                                                        da8.f164950c = false;
                                                                    }
                                                                    bolh bolh4 = (bolh) da8.f164949b;
                                                                    int i18 = bolh4.f133523a | 4;
                                                                    try {
                                                                        bolh4.f133523a = i18;
                                                                        bolh4.f133526d = z8;
                                                                        aufs aufs2 = auix.f91930f;
                                                                        int i19 = aufs2.f91739b;
                                                                        bolh4.f133523a = i18 | 8;
                                                                        bolh4.f133527e = i19;
                                                                        Throwable th = aufs2.f91740c;
                                                                        if (th != null) {
                                                                            String simpleName = th.getClass().getSimpleName();
                                                                            if (da8.f164950c) {
                                                                                da8.mo74035c();
                                                                                da8.f164950c = false;
                                                                            }
                                                                            bolh bolh5 = (bolh) da8.f164949b;
                                                                            simpleName.getClass();
                                                                            bolh5.f133523a |= 16;
                                                                            bolh5.f133528f = simpleName;
                                                                        }
                                                                    } catch (ExecutionException e4) {
                                                                    }
                                                                }
                                                                long j2 = auix.f91929e;
                                                                if (da8.f164950c) {
                                                                    da8.mo74035c();
                                                                    da8.f164950c = false;
                                                                }
                                                                bolh bolh6 = (bolh) da8.f164949b;
                                                                bolh6.f133523a |= 32;
                                                                bolh6.f133529g = j2;
                                                                bolh bolh7 = (bolh) da8.mo74062i();
                                                                if (da7.f164950c) {
                                                                    da7.mo74035c();
                                                                    da7.f164950c = false;
                                                                }
                                                                bolf bolf3 = (bolf) da7.f164949b;
                                                                bolh7.getClass();
                                                                if (!bolf3.f133519d.mo73666a()) {
                                                                    bolf3.f133519d = GeneratedMessageLite.m124021a(bolf3.f133519d);
                                                                }
                                                                bolf3.f133519d.add(bolh7);
                                                                it = it2;
                                                                auit6 = auit5;
                                                            } else {
                                                                throw null;
                                                            }
                                                        }
                                                        auit3 = auit6;
                                                    }
                                                    bolf bolf4 = (bolf) da7.mo74062i();
                                                    if (da5.f164950c) {
                                                        da5.mo74035c();
                                                        da5.f164950c = false;
                                                    }
                                                    bokw bokw3 = (bokw) da5.f164949b;
                                                    bolf4.getClass();
                                                    if (!bokw3.f133470e.mo73666a()) {
                                                        bokw3.f133470e = GeneratedMessageLite.m124021a(bokw3.f133470e);
                                                    }
                                                    bokw3.f133470e.add(bolf4);
                                                    i14++;
                                                } catch (ExecutionException e5) {
                                                    auit5 = auit6;
                                                    i13++;
                                                    list7 = list3;
                                                    list9 = list2;
                                                    size5 = i6;
                                                    size2 = i5;
                                                    auit6 = auit3;
                                                }
                                            } catch (ExecutionException e6) {
                                                auit5 = auit6;
                                                i5 = size2;
                                                i13++;
                                                list7 = list3;
                                                list9 = list2;
                                                size5 = i6;
                                                size2 = i5;
                                                auit6 = auit3;
                                            }
                                        } catch (ExecutionException e7) {
                                            auit5 = auit6;
                                            list2 = list9;
                                            list3 = list7;
                                            i6 = size5;
                                            i5 = size2;
                                            i13++;
                                            list7 = list3;
                                            list9 = list2;
                                            size5 = i6;
                                            size2 = i5;
                                            auit6 = auit3;
                                        }
                                        i13++;
                                        list7 = list3;
                                        list9 = list2;
                                        size5 = i6;
                                        size2 = i5;
                                        auit6 = auit3;
                                    }
                                    if (!bqgg.isCancelled()) {
                                        i16++;
                                    } else {
                                        i15++;
                                    }
                                    i13++;
                                    list7 = list3;
                                    list9 = list2;
                                    size5 = i6;
                                    size2 = i5;
                                    auit6 = auit3;
                                }
                                auit2 = auit6;
                                list = list7;
                                i4 = size2;
                                if (i14 == 0) {
                                    augv bN = auiq2.mo50572bN();
                                    int size6 = auiq2.f91897c.size();
                                    int i20 = ((C1245ok) auiq2.f91896b).f26809h;
                                    int i21 = auiq2.f91900f;
                                    StringBuilder sb = new StringBuilder(79);
                                    sb.append("logged empty config ");
                                    sb.append(i15);
                                    sb.append("/");
                                    sb.append(i16);
                                    sb.append("/");
                                    sb.append(size6);
                                    sb.append("/");
                                    sb.append(i20);
                                    sb.append("/");
                                    sb.append(i21);
                                    auho.m77069a(bN, new IllegalStateException(sb.toString()));
                                }
                                bokw bokw4 = (bokw) da5.mo74062i();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bokz bokz5 = (bokz) da2.f164949b;
                                bokw4.getClass();
                                if (!bokz5.f133484d.mo73666a()) {
                                    bokz5.f133484d = GeneratedMessageLite.m124021a(bokz5.f133484d);
                                }
                                bokz5.f133484d.add(bokw4);
                            } else {
                                auit2 = auit6;
                                list = list7;
                                i4 = size2;
                            }
                            i2++;
                            list7 = list;
                            size2 = i4;
                            auit6 = auit2;
                            z2 = false;
                            i9 = 4;
                            z3 = true;
                            i10 = 2;
                        }
                        da = bole.f133504i.mo74144da();
                        boolean z9 = emergencyLocationChimeraService.f109053e.f91845a;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z2;
                        }
                        bole bole = (bole) da.f164949b;
                        boolean z10 = bole.f133506a | z3;
                        bole.f133506a = z10 ? 1 : 0;
                        bole.f133507b = z9;
                        auhv auhv = emergencyLocationChimeraService.f109053e;
                        boolean z11 = auhv.f91846b;
                        boolean z12 = z10 | i10;
                        bole.f133506a = z12 ? 1 : 0;
                        bole.f133508c = z11;
                        boolean z13 = auhv.f91847c;
                        boolean z14 = z12 | i9;
                        bole.f133506a = z14 ? 1 : 0;
                        bole.f133509d = z13;
                        i3 = auhv.f91848d;
                        if (i3 == 3) {
                            z = true;
                        } else {
                            z = i3 == i10;
                        }
                        boolean z15 = z14 | true;
                        bole.f133506a = z15 ? 1 : 0;
                        bole.f133510e = z;
                        if (!(i3 == 3 || i3 == z3)) {
                            z3 = false;
                        }
                        boolean z16 = z15 | true;
                        bole.f133506a = z16 ? 1 : 0;
                        bole.f133511f = z3;
                        boolean z17 = auhv.f91849e;
                        boolean z18 = z16 | true;
                        bole.f133506a = z18 ? 1 : 0;
                        bole.f133512g = z17;
                        boolean z19 = auhv.f91850f;
                        bole.f133506a = z18 | true ? 1 : 0;
                        bole.f133513h = z19;
                        bole bole2 = (bole) da.mo74062i();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = z2;
                        }
                        bokz bokz6 = (bokz) da2.f164949b;
                        bole2.getClass();
                        bokz6.f133485e = bole2;
                        bokz6.f133481a |= i9;
                        emergencyLocationChimeraService.f109052d.mo24335a(((bokz) da2.mo74062i()).serializeToBytes()).mo24327b();
                        C1223np npVar = auho.f91828a;
                        auit = auit6;
                    }
                } else if (b.equals("SMS")) {
                    c = 1;
                    if (c == 0) {
                    }
                    if (da2.f164950c) {
                    }
                    bokz bokz7 = (bokz) da2.f164949b;
                    bolb bolb72 = (bolb) da3.mo74062i();
                    bolb72.getClass();
                    bokz7.f133483c = bolb72;
                    bokz7.f133481a |= 2;
                    if (auit6.f91918g) {
                    }
                    List list62 = auit6.f91916e;
                    size = list62.size();
                    location = null;
                    while (i < size) {
                    }
                    if (location != null) {
                    }
                    ((bokz) da2.f164949b).f133484d = GeneratedMessageLite.m124030de();
                    List list72 = auit6.f91916e;
                    size2 = list72.size();
                    i2 = 0;
                    while (i2 < size2) {
                    }
                    da = bole.f133504i.mo74144da();
                    boolean z92 = emergencyLocationChimeraService.f109053e.f91845a;
                    if (da.f164950c) {
                    }
                    bole bole3 = (bole) da.f164949b;
                    boolean z102 = bole3.f133506a | z3;
                    bole3.f133506a = z102 ? 1 : 0;
                    bole3.f133507b = z92;
                    auhv auhv2 = emergencyLocationChimeraService.f109053e;
                    boolean z112 = auhv2.f91846b;
                    boolean z122 = z102 | i10;
                    bole3.f133506a = z122 ? 1 : 0;
                    bole3.f133508c = z112;
                    boolean z132 = auhv2.f91847c;
                    boolean z142 = z122 | i9;
                    bole3.f133506a = z142 ? 1 : 0;
                    bole3.f133509d = z132;
                    i3 = auhv2.f91848d;
                    if (i3 == 3) {
                    }
                    boolean z152 = z142 | true;
                    bole3.f133506a = z152 ? 1 : 0;
                    bole3.f133510e = z;
                    z3 = false;
                    boolean z162 = z152 | true;
                    bole3.f133506a = z162 ? 1 : 0;
                    bole3.f133511f = z3;
                    boolean z172 = auhv2.f91849e;
                    boolean z182 = z162 | true;
                    bole3.f133506a = z182 ? 1 : 0;
                    bole3.f133512g = z172;
                    boolean z192 = auhv2.f91850f;
                    bole3.f133506a = z182 | true ? 1 : 0;
                    bole3.f133513h = z192;
                    bole bole22 = (bole) da.mo74062i();
                    if (da2.f164950c) {
                    }
                    bokz bokz62 = (bokz) da2.f164949b;
                    bole22.getClass();
                    bokz62.f133485e = bole22;
                    bokz62.f133481a |= i9;
                    emergencyLocationChimeraService.f109052d.mo24335a(((bokz) da2.mo74062i()).serializeToBytes()).mo24327b();
                    C1223np npVar2 = auho.f91828a;
                    auit = auit6;
                }
                c = 65535;
                if (c == 0) {
                }
                if (da2.f164950c) {
                }
                bokz bokz72 = (bokz) da2.f164949b;
                bolb bolb722 = (bolb) da3.mo74062i();
                bolb722.getClass();
                bokz72.f133483c = bolb722;
                bokz72.f133481a |= 2;
                if (auit6.f91918g) {
                }
                List list622 = auit6.f91916e;
                size = list622.size();
                location = null;
                while (i < size) {
                }
                if (location != null) {
                }
                ((bokz) da2.f164949b).f133484d = GeneratedMessageLite.m124030de();
                List list722 = auit6.f91916e;
                size2 = list722.size();
                i2 = 0;
                while (i2 < size2) {
                }
                da = bole.f133504i.mo74144da();
                boolean z922 = emergencyLocationChimeraService.f109053e.f91845a;
                if (da.f164950c) {
                }
                bole bole32 = (bole) da.f164949b;
                boolean z1022 = bole32.f133506a | z3;
                bole32.f133506a = z1022 ? 1 : 0;
                bole32.f133507b = z922;
                auhv auhv22 = emergencyLocationChimeraService.f109053e;
                boolean z1122 = auhv22.f91846b;
                boolean z1222 = z1022 | i10;
                bole32.f133506a = z1222 ? 1 : 0;
                bole32.f133508c = z1122;
                boolean z1322 = auhv22.f91847c;
                boolean z1422 = z1222 | i9;
                bole32.f133506a = z1422 ? 1 : 0;
                bole32.f133509d = z1322;
                i3 = auhv22.f91848d;
                if (i3 == 3) {
                }
                boolean z1522 = z1422 | true;
                bole32.f133506a = z1522 ? 1 : 0;
                bole32.f133510e = z;
                z3 = false;
                boolean z1622 = z1522 | true;
                bole32.f133506a = z1622 ? 1 : 0;
                bole32.f133511f = z3;
                boolean z1722 = auhv22.f91849e;
                boolean z1822 = z1622 | true;
                bole32.f133506a = z1822 ? 1 : 0;
                bole32.f133512g = z1722;
                boolean z1922 = auhv22.f91850f;
                bole32.f133506a = z1822 | true ? 1 : 0;
                bole32.f133513h = z1922;
                bole bole222 = (bole) da.mo74062i();
                if (da2.f164950c) {
                }
                bokz bokz622 = (bokz) da2.f164949b;
                bole222.getClass();
                bokz622.f133485e = bole222;
                bokz622.f133481a |= i9;
                emergencyLocationChimeraService.f109052d.mo24335a(((bokz) da2.mo74062i()).serializeToBytes()).mo24327b();
                C1223np npVar22 = auho.f91828a;
                auit = auit6;
            } else {
                auit = auit6;
            }
        }
        emergencyLocationChimeraService.f109054f.remove(auit);
        if (!emergencyLocationChimeraService.f109054f.isEmpty()) {
            return null;
        }
        emergencyLocationChimeraService.stopSelf(emergencyLocationChimeraService.f109055g);
        return null;
    }
}
