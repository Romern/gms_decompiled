package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: bhst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhst implements bhsq {

    /* renamed from: a */
    public final bhtp f119491a;

    /* renamed from: b */
    public final bhtm f119492b;

    /* renamed from: c */
    public bhsp f119493c;

    /* renamed from: d */
    public final bicy f119494d;

    /* renamed from: e */
    private final bhvs f119495e;

    /* renamed from: f */
    private Collection f119496f;

    /* renamed from: g */
    private final bhss f119497g = new bhss(this);

    public bhst(bhtp bhtp, bhvs bhvs, bicy bicy, bhtm bhtm) {
        this.f119491a = bhtp;
        this.f119495e = bhvs;
        this.f119492b = bhtm;
        this.f119494d = bicy;
    }

    /* renamed from: a */
    public static List m101466a(List list) {
        ArrayList arrayList = new ArrayList();
        C1225nr nrVar = new C1225nr();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nrVar.add(Long.valueOf(((bhsu) list.get(i)).mo64234h()));
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bhsu bhsu = (bhsu) list.get(i2);
            bvni i3 = bhsu.mo64236i();
            if (i3 != null) {
                long j = i3.f156863a;
                if (j != 0) {
                    Long valueOf = Long.valueOf(j);
                    if (!nrVar.contains(valueOf)) {
                        nrVar.add(valueOf);
                        bxvd da = bvoa.f156994o.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvoa bvoa = (bvoa) da.f164949b;
                        i3.getClass();
                        bvoa.f156997b = i3;
                        bvoa.f156996a |= 1;
                        int b = bhsu.mo64227b();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvoa bvoa2 = (bvoa) da.f164949b;
                        bvoa2.f156996a |= 4;
                        bvoa2.f156999d = b;
                        int c = bhsu.mo64228c();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvoa bvoa3 = (bvoa) da.f164949b;
                        bvoa3.f156996a |= 8;
                        bvoa3.f157000e = c;
                        arrayList.add(bhsu.m101471a((bvoa) da.mo74062i()));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo64199a() {
        this.f119495e.mo64343a();
        this.f119493c = null;
    }

    /* renamed from: a */
    public final void mo64200a(long j, String str, bhub bhub) {
        bxvd bxvd;
        bxvd bxvd2;
        try {
            bvnx bvnx = (bvnx) GeneratedMessageLite.m124014a(bvnx.f156978c, boan.f132471e.mo68796b(str));
            bxvd da = bvoa.f156994o.mo74144da();
            bvni bvni = bvnx.f156981b;
            if (bvni == null) {
                bvni = bvni.f156861b;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvoa bvoa = (bvoa) da.f164949b;
            bvni.getClass();
            bvoa.f156997b = bvni;
            int i = bvoa.f156996a | 1;
            bvoa.f156996a = i;
            int i2 = bvnx.f156980a;
            if ((i2 & 1) == 0 || (i2 & 2) != 0) {
                bvnx.getClass();
                bvoa.f157009n = bvnx;
                i |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                bvoa.f156996a = i;
            }
            if (bhub != null) {
                int i3 = bhub.f119605a;
                int i4 = i | 4;
                bvoa.f156996a = i4;
                bvoa.f156999d = i3;
                int i5 = bhub.f119606b;
                bvoa.f156996a = i4 | 8;
                bvoa.f157000e = i5;
            }
            bvoa bvoa2 = (bvoa) da.mo74062i();
            this.f119491a.mo64273a(new bvoa[]{bvoa2});
            bhtm bhtm = this.f119492b;
            bvnm bvnm = bvnm.CHECKIN_EDIT;
            bvni bvni2 = bvoa2.f156997b;
            if (bvni2 == null) {
                bvni2 = bvni.f156861b;
            }
            long j2 = bvni2.f156863a;
            if (j2 != 0) {
                bhtm.mo64276a(bvoa2);
                bvnw bvnw = (bvnw) bhtm.f119562b.get(Long.valueOf(j2));
                if (bvnw == null) {
                    bxvd = bvnw.f156971f.mo74144da();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bvnw bvnw2 = (bvnw) bxvd.f164949b;
                    bvnw2.f156973a |= 4;
                    bvnw2.f156974b = j2;
                } else {
                    bxvd bxvd3 = (bxvd) bvnw.mo74142c(5);
                    bxvd3.mo73625a((GeneratedMessageLite) bvnw);
                    bxvd = bxvd3;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= ((bvnw) bxvd.f164949b).f156976d.size()) {
                        bxvd2 = null;
                        i6 = -1;
                        break;
                    }
                    bvnn bvnn = (bvnn) ((bvnw) bxvd.f164949b).f156976d.get(i6);
                    bvnm a = bvnm.m121290a(bvnn.f156950b);
                    if (a == null) {
                        a = bvnm.INVALID;
                    }
                    if (a == bvnm) {
                        bxvd2 = (bxvd) bvnn.mo74142c(5);
                        bxvd2.mo73625a((GeneratedMessageLite) bvnn);
                        break;
                    }
                    i6++;
                }
                if (bxvd2 == null) {
                    bxvd2 = bvnn.f156947e.mo74144da();
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bvnn bvnn2 = (bvnn) bxvd2.f164949b;
                    bvnn2.f156950b = bvnm.f156946ao;
                    bvnn2.f156949a |= 1;
                }
                int i7 = ((bvnn) bxvd2.f164949b).f156951c + 1;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bvnn bvnn3 = (bvnn) bxvd2.f164949b;
                bvnn bvnn4 = bvnn.f156947e;
                bvnn3.f156949a |= 2;
                bvnn3.f156951c = i7;
                if (!bvnn3.f156952d.mo73666a()) {
                    bvnn3.f156952d = GeneratedMessageLite.m124020a(bvnn3.f156952d);
                }
                bvnn3.f156952d.mo74161a(j);
                if (i6 != -1) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bvnw bvnw3 = (bvnw) bxvd.f164949b;
                    bvnn bvnn5 = (bvnn) bxvd2.mo74062i();
                    bvnn5.getClass();
                    bvnw3.mo73384a();
                    bvnw3.f156976d.set(i6, bvnn5);
                } else {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bvnw bvnw4 = (bvnw) bxvd.f164949b;
                    bvnn bvnn6 = (bvnn) bxvd2.mo74062i();
                    bvnn6.getClass();
                    bvnw4.mo73384a();
                    bvnw4.f156976d.add(bvnn6);
                }
                bhtm.f119562b.put(Long.valueOf(j2), (bvnw) bxvd.mo74062i());
                return;
            }
            bhwp a2 = bhuj.m101555a();
            String valueOf = String.valueOf(bvoa2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
            sb.append("PlaceInfoMobile passed to addInteraction missing fprint: ");
            sb.append(valueOf);
            a2.mo64360b(sb.toString());
        } catch (bxwf e) {
            throw new IllegalArgumentException("Could not parse place id into a proto", e);
        }
    }

    /* renamed from: a */
    public final void mo64201a(bhsp bhsp) {
        this.f119493c = bhsp;
        this.f119495e.mo64344a(this.f119497g);
    }

    /* renamed from: a */
    public final void mo64202a(bhtx bhtx, List list) {
        HashSet<Long> hashSet;
        if (this.f119493c != null) {
            List a = bhug.m101542a(bhtx.f119580a, (int) cggm.f186849a.mo6606a().mo83734m());
            this.f119496f = a;
            if (a == null) {
                hashSet = new HashSet();
            } else {
                bhtm bhtm = this.f119492b;
                HashSet hashSet2 = new HashSet();
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    List list2 = (List) bhtm.f119561a.get(Long.valueOf(((Long) a.get(i)).longValue()));
                    if (list2 != null) {
                        hashSet2.addAll(list2);
                    }
                }
                hashSet = hashSet2;
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hashSet.add(Long.valueOf(((bhsu) list.get(i2)).mo64234h()));
            }
            bhtm bhtm2 = this.f119492b;
            C1223np npVar = new C1223np();
            for (Long l : hashSet) {
                long longValue = l.longValue();
                C1245ok okVar = bhtm2.f119562b;
                Long valueOf = Long.valueOf(longValue);
                bvnw bvnw = (bvnw) okVar.get(valueOf);
                if (bvnw != null) {
                    npVar.put(valueOf, bvnw);
                }
            }
            ArrayList arrayList = new ArrayList(list.size() + npVar.f26809h);
            int size3 = list.size();
            for (int i3 = 0; i3 < size3; i3++) {
                bhsu bhsu = (bhsu) list.get(i3);
                Long valueOf2 = Long.valueOf(bhsu.mo64234h());
                bvnw bvnw2 = (bvnw) npVar.get(valueOf2);
                if (bvnw2 == null) {
                    arrayList.add(bhsu);
                } else {
                    arrayList.add(new bhsu(bhsu.f119498a, bvnw2, bhsu.f119500c));
                    npVar.remove(valueOf2);
                }
            }
            this.f119491a.mo64272a(npVar.keySet(), new bhsr(this, npVar, arrayList, bhtx));
            return;
        }
        bhuj.m101555a().mo64361c("Candidate callback not set - unable to deliver updates");
    }
}
