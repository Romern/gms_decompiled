package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: ayyr */
final /* synthetic */ class ayyr implements Callable {

    /* renamed from: a */
    private final bqgg f98762a;

    /* renamed from: b */
    private final ayyf f98763b;

    public ayyr(bqgg bqgg, ayyf ayyf) {
        this.f98762a = bqgg;
        this.f98763b = ayyf;
    }

    public final Object call() {
        boolean z;
        bqgg bqgg = this.f98762a;
        ayyf ayyf = this.f98763b;
        bxvf[] bxvfArr = (bxvf[]) bqga.m112780a((Future) bqgg);
        bxvd da = boki.f133411g.mo74144da();
        bomh bomh = (bomh) bomi.f133655b.mo74144da();
        for (ayye ayye : ayyf.f98736b) {
            int i = 3;
            boolean z2 = true;
            if (ayye.f98733b == 1) {
                bptv bptv = ayyf.f98735a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boki boki = (boki) da.f164949b;
                bptv.getClass();
                boki.f133414b = bptv;
                boki.f133413a |= 1;
                bptv a = ayyv.m85089a(ayye, false);
                if (a != null) {
                    bptu bptu = ((aywu) ayye.f98732a.get(1)).f98654c;
                    if (bptu == null) {
                        bptu = bptu.f139179e;
                    }
                    if ((bptu.f139181a & 1) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    bmxy.m108600b(z);
                    bxvd da2 = bomg.f133646g.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bomg bomg = (bomg) da2.f164949b;
                    bomg.f133650c = 3;
                    bomg.f133648a |= 2;
                    bxvd da3 = bomj.f133659e.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bomj bomj = (bomj) da3.f164949b;
                    a.getClass();
                    bomj.f133662b = a;
                    bomj.f133661a = 3;
                    bxvd da4 = bptu.f139179e.mo74144da();
                    int i2 = bptu.f139182b;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bptu bptu2 = (bptu) da4.f164949b;
                    int i3 = bptu2.f139181a | 1;
                    bptu2.f139181a = i3;
                    bptu2.f139182b = i2;
                    int i4 = bptu.f139183c;
                    bptu2.f139181a = i3 | 8;
                    bptu2.f139183c = i4;
                    bptu bptu3 = (bptu) da4.mo74062i();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bomj bomj2 = (bomj) da3.f164949b;
                    bptu3.getClass();
                    bomj2.f133664d = bptu3;
                    bomj2.f133663c = 2;
                    bomj bomj3 = (bomj) da3.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bomg bomg2 = (bomg) da2.f164949b;
                    bomj3.getClass();
                    bomg2.f133649b = bomj3;
                    bomg2.f133648a |= 1;
                    aywu a2 = ayyc.m85064a(ayye);
                    bxvj bxvj = ayzu.f98816a;
                    a2.mo74135a(bxvj);
                    if (a2.f164952m.mo73911a(bxvj.f164958d)) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bomg bomg3 = (bomg) da2.f164949b;
                        bomg3.f133648a |= 32;
                        bomg3.f133653f = true;
                    }
                    if ((a2.f98652a & 4) != 0) {
                        long a3 = ayvj.m84935a(a2.f98656e);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bomg bomg4 = (bomg) da2.f164949b;
                        bomg4.f133648a |= 16;
                        bomg4.f133652e = a3;
                    }
                    if (ayyf.f98736b.size() == 1) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boki boki2 = (boki) da.f164949b;
                        a.getClass();
                        boki2.f133416d = a;
                        boki2.f133413a |= 2;
                        bomh.mo68916a((bomg) da2.mo74062i());
                    } else {
                        bxvd da5 = bomj.f133659e.mo74144da();
                        bxvd da6 = bptu.f139179e.mo74144da();
                        int c = ayye.mo54527c();
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bptu bptu4 = (bptu) da6.f164949b;
                        bptu4.f139181a = 1 | bptu4.f139181a;
                        bptu4.f139182b = c;
                        bptu bptu5 = a2.f98654c;
                        if (bptu5 == null) {
                            bptu5 = bptu.f139179e;
                        }
                        int i5 = bptu5.f139183c;
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bptu bptu6 = (bptu) da6.f164949b;
                        bptu6.f139181a |= 8;
                        bptu6.f139183c = i5;
                        bptu bptu7 = (bptu) da6.mo74062i();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bomj bomj4 = (bomj) da5.f164949b;
                        bptu7.getClass();
                        bomj4.f133664d = bptu7;
                        bomj4.f133663c = 2;
                        bomj bomj5 = (bomj) da5.mo74062i();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bomg bomg5 = (bomg) da2.f164949b;
                        bomj5.getClass();
                        bomg5.f133651d = bomj5;
                        bomg5.f133648a |= 4;
                        bomh.mo68916a((bomg) da2.mo74062i());
                        bptu bptu8 = ayyc.m85065b(ayye).f98654c;
                        if (bptu8 == null) {
                            bptu8 = bptu.f139179e;
                        }
                        bptv bptv2 = bptu8.f139184d;
                        if (bptv2 == null) {
                            bptv2 = bptv.f139186d;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boki boki3 = (boki) da.f164949b;
                        bptv2.getClass();
                        boki3.f133416d = bptv2;
                        boki3.f133413a |= 2;
                    }
                } else {
                    if (ayyf.f98736b.size() != 1) {
                        z2 = false;
                    }
                    bmxy.m108601b(z2, "Impressions must be in their own event");
                    aywu b = ayyc.m85065b(ayyf);
                    bxvj bxvj2 = ayzv.f98818a;
                    b.mo74135a(bxvj2);
                    if (b.f164952m.mo73911a(bxvj2.f164958d)) {
                        bxvj bxvj3 = ayzv.f98818a;
                        b.mo74135a(bxvj3);
                        Object b2 = b.f164952m.mo73913b(bxvj3.f164958d);
                        if (b2 == null) {
                            b2 = bxvj3.f164956b;
                        } else {
                            bxvj3.mo74139a(b2);
                        }
                        bxvf bxvf = (bxvf) bpby.f135681j.mo74144da();
                        int i6 = ((ayyw) b2).f98772a;
                        if (bxvf.f164950c) {
                            bxvf.mo74035c();
                            bxvf.f164950c = false;
                        }
                        bpby bpby = (bpby) bxvf.f164949b;
                        bpby.f135683a |= 4;
                        bpby.f135684b = i6;
                        bpby bpby2 = (bpby) bxvf.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boki boki4 = (boki) da.f164949b;
                        bpby2.getClass();
                        boki4.f133417e = bpby2;
                        boki4.f133413a |= 16;
                    }
                }
            } else {
                bptv a4 = ayyv.m85089a(ayye, true);
                aywu a5 = ayyc.m85064a(ayye);
                if (ayyf.f98736b.size() != 1) {
                    bptu bptu9 = ayyc.m85065b(ayye).f98654c;
                    if (bptu9 == null) {
                        bptu9 = bptu.f139179e;
                    }
                    bptv bptv3 = bptu9.f139184d;
                    if (bptv3 == null) {
                        bptv3 = bptv.f139186d;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boki boki5 = (boki) da.f164949b;
                    bptv3.getClass();
                    boki5.f133416d = bptv3;
                    boki5.f133413a |= 2;
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boki boki6 = (boki) da.f164949b;
                    a4.getClass();
                    boki6.f133416d = a4;
                    boki6.f133413a |= 2;
                }
                bxvd da7 = bomj.f133659e.mo74144da();
                bxvd da8 = bptu.f139179e.mo74144da();
                bptu bptu10 = a5.f98654c;
                if (bptu10 == null) {
                    bptu10 = bptu.f139179e;
                }
                int i7 = bptu10.f139182b;
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bptu bptu11 = (bptu) da8.f164949b;
                bptu11.f139181a |= 1;
                bptu11.f139182b = i7;
                bptu bptu12 = a5.f98654c;
                if (bptu12 == null) {
                    bptu12 = bptu.f139179e;
                }
                int i8 = bptu12.f139183c;
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bptu bptu13 = (bptu) da8.f164949b;
                bptu13.f139181a |= 8;
                bptu13.f139183c = i8;
                bptu bptu14 = (bptu) da8.mo74062i();
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bomj bomj6 = (bomj) da7.f164949b;
                bptu14.getClass();
                bomj6.f133664d = bptu14;
                bomj6.f133663c = 2;
                if ((a4.f139188a & 2) == 0) {
                    bptw bptw = a4.f139189b;
                    if (bptw == null) {
                        bptw = bptw.f139192c;
                    }
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    bomj bomj7 = (bomj) da7.f164949b;
                    bptw.getClass();
                    bomj7.f133662b = bptw;
                    bomj7.f133661a = 1;
                } else {
                    a4.getClass();
                    bomj6.f133662b = a4;
                    bomj6.f133661a = 3;
                }
                bxvd da9 = bomg.f133646g.mo74144da();
                int i9 = ayye.f98733b - 1;
                if (i9 == 0) {
                    i = 4;
                } else if (i9 == 1) {
                    i = 2;
                }
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                bomg bomg6 = (bomg) da9.f164949b;
                bomg6.f133650c = i - 1;
                bomg6.f133648a |= 2;
                bomj bomj8 = (bomj) da7.mo74062i();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                bomg bomg7 = (bomg) da9.f164949b;
                bomj8.getClass();
                bomg7.f133649b = bomj8;
                bomg7.f133648a |= 1;
                if ((a5.f98652a & 4) != 0) {
                    long a6 = ayvj.m84935a(a5.f98656e);
                    if (da9.f164950c) {
                        da9.mo74035c();
                        da9.f164950c = false;
                    }
                    bomg bomg8 = (bomg) da9.f164949b;
                    bomg8.f133648a |= 16;
                    bomg8.f133652e = a6;
                }
                bomh.mo68916a((bomg) da9.mo74062i());
            }
        }
        if (((bomi) bomh.f164949b).f133657a.size() > 0) {
            bomi bomi = (bomi) bomh.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boki boki7 = (boki) da.f164949b;
            bomi.getClass();
            boki7.f133418f = bomi;
            boki7.f133413a |= 64;
        }
        for (bxvf bxvf2 : bxvfArr) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boki boki8 = (boki) da.f164949b;
            bpcb bpcb = (bpcb) bxvf2.mo74062i();
            bpcb.getClass();
            if (!boki8.f133415c.mo73666a()) {
                boki8.f133415c = GeneratedMessageLite.m124021a(boki8.f133415c);
            }
            boki8.f133415c.add(bpcb);
        }
        return (boki) da.mo74062i();
    }
}
