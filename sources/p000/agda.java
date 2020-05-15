package p000;

import java.util.HashSet;

/* renamed from: agda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agda extends agdb {

    /* renamed from: a */
    final /* synthetic */ agdd f65277a;

    /* renamed from: h */
    private final agmu f65278h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agda(agdd agdd, String str, int i, agmu agmu) {
        super(str, i);
        this.f65277a = agdd;
        this.f65278h = agmu;
    }

    /* renamed from: a */
    public final int mo35301a() {
        return this.f65278h.f65991b;
    }

    /* renamed from: b */
    public final boolean mo35303b() {
        return false;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x041a A[RETURN] */
    /* renamed from: a */
    public final boolean mo35302a(agni agni, long j, agdr agdr, boolean z) {
        Integer num;
        boolean z2;
        Boolean bool;
        Boolean bool2;
        bxwc bxwc;
        Integer num2;
        Integer num3;
        String str;
        agni agni2 = agni;
        cfiw.m139808c();
        long j2 = this.f65278h.f65997h ? agdr.f65334e : j;
        String str2 = "null";
        if (this.f65277a.mo35497E().mo35441a(2)) {
            agib agib = this.f65277a.mo35497E().f65572k;
            Integer valueOf = Integer.valueOf(this.f65280c);
            agmu agmu = this.f65278h;
            if ((agmu.f65990a & 1) != 0) {
                num3 = Integer.valueOf(agmu.f65991b);
            } else {
                num3 = null;
            }
            agib.mo35438a("Evaluating filter. audience, filter, event", valueOf, num3, this.f65277a.mo35541y().mo35422a(this.f65278h.f65992c));
            agib agib2 = this.f65277a.mo35497E().f65572k;
            agmp o = this.f65277a.mo35657o();
            agmu agmu2 = this.f65278h;
            if (agmu2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("\nevent_filter {\n");
                if ((agmu2.f65990a & 1) != 0) {
                    agmp.m54569a(sb, 0, "filter_id", Integer.valueOf(agmu2.f65991b));
                }
                agmp.m54569a(sb, 0, "event_name", o.mo35541y().mo35422a(agmu2.f65992c));
                String a = agmp.m54564a(agmu2.f65995f, agmu2.f65996g, agmu2.f65997h);
                if (!a.isEmpty()) {
                    agmp.m54569a(sb, 0, "filter_type", a);
                }
                if ((agmu2.f65990a & 8) != 0) {
                    agmy agmy = agmu2.f65994e;
                    if (agmy == null) {
                        agmy = agmy.f66006g;
                    }
                    agmp.m54568a(sb, 1, "event_count_filter", agmy);
                }
                if (agmu2.f65993d.size() > 0) {
                    sb.append("  filters {\n");
                    bxwc bxwc2 = agmu2.f65993d;
                    int size = bxwc2.size();
                    for (int i = 0; i < size; i++) {
                        o.mo35713a(sb, 2, (agmv) bxwc2.get(i));
                    }
                }
                agmp.m54567a(sb, 1);
                sb.append("}\n}\n");
                str = sb.toString();
            } else {
                str = str2;
            }
            agib2.mo35436a("Filter definition", str);
        }
        agmu agmu3 = this.f65278h;
        int i2 = agmu3.f65990a;
        if ((i2 & 1) == 0 || agmu3.f65991b > 256) {
            agib agib3 = this.f65277a.mo35497E().f65567f;
            Object a2 = agid.m54288a(this.f65279b);
            agmu agmu4 = this.f65278h;
            if ((agmu4.f65990a & 1) != 0) {
                num = Integer.valueOf(agmu4.f65991b);
            } else {
                num = null;
            }
            agib3.mo35437a("Invalid event filter ID. appId, id", a2, String.valueOf(num));
            if (!this.f65277a.mo35538v().mo35320c(this.f65279b, aghn.f65470Z)) {
                return true;
            }
            return false;
        }
        boolean z3 = agmu3.f65995f;
        boolean z4 = agmu3.f65996g;
        boolean z5 = agmu3.f65997h;
        if (z3) {
            z2 = true;
        } else {
            z2 = z4 || z5;
        }
        if (z && !z2) {
            agib agib4 = this.f65277a.mo35497E().f65572k;
            Integer valueOf2 = Integer.valueOf(this.f65280c);
            agmu agmu5 = this.f65278h;
            if ((agmu5.f65990a & 1) != 0) {
                num2 = Integer.valueOf(agmu5.f65991b);
            } else {
                num2 = null;
            }
            agib4.mo35437a("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf2, num2);
            return true;
        }
        String str3 = agni2.f66068c;
        if ((i2 & 8) != 0) {
            agmy agmy2 = agmu3.f65994e;
            if (agmy2 == null) {
                agmy2 = agmy.f66006g;
            }
            Boolean a3 = m54020a(j2, agmy2);
            if (a3 == null) {
                bool = null;
            } else if (!a3.booleanValue()) {
                bool = false;
            }
            agib agib5 = this.f65277a.mo35497E().f65572k;
            if (bool != null) {
                str2 = bool;
            }
            agib5.mo35436a("Event filter result", str2);
            if (bool != null) {
                return false;
            }
            this.f65281d = true;
            if (!bool.booleanValue()) {
                return true;
            }
            this.f65282e = true;
            if (!z2 || (agni2.f66066a & 2) == 0) {
                return true;
            }
            Long valueOf3 = Long.valueOf(agni2.f66069d);
            if (!this.f65278h.f65996g) {
                this.f65283f = valueOf3;
                return true;
            }
            this.f65284g = valueOf3;
            return true;
        }
        HashSet hashSet = new HashSet();
        bxwc bxwc3 = agmu3.f65993d;
        int size2 = bxwc3.size();
        int i3 = 0;
        while (true) {
            if (i3 < size2) {
                agmv agmv = (agmv) bxwc3.get(i3);
                if (agmv.f66004e.isEmpty()) {
                    this.f65277a.mo35497E().f65567f.mo35436a("null or empty param name in filter. event", this.f65277a.mo35541y().mo35422a(str3));
                    bool = null;
                    break;
                }
                hashSet.add(agmv.f66004e);
                i3++;
            } else {
                C1223np npVar = new C1223np();
                bxwc bxwc4 = agni2.f66067b;
                int size3 = bxwc4.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        bxwc bxwc5 = agmu3.f65993d;
                        int size4 = bxwc5.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size4) {
                                bool = true;
                                break;
                            }
                            agmv agmv2 = (agmv) bxwc5.get(i5);
                            boolean z6 = (agmv2.f66000a & 4) != 0 && agmv2.f66003d;
                            String str4 = agmv2.f66004e;
                            if (str4.isEmpty()) {
                                this.f65277a.mo35497E().f65567f.mo35436a("Event has empty param name. event", this.f65277a.mo35541y().mo35422a(str3));
                                bool = null;
                                break;
                            }
                            Object obj = npVar.get(str4);
                            if (obj instanceof Long) {
                                if ((agmv2.f66000a & 2) == 0) {
                                    this.f65277a.mo35497E().f65567f.mo35437a("No number filter for long param. event, param", this.f65277a.mo35541y().mo35422a(str3), this.f65277a.mo35541y().mo35424b(str4));
                                    bool = null;
                                    break;
                                }
                                long longValue = ((Long) obj).longValue();
                                agmy agmy3 = agmv2.f66002c;
                                if (agmy3 == null) {
                                    agmy3 = agmy.f66006g;
                                }
                                Boolean a4 = m54020a(longValue, agmy3);
                                if (a4 == null) {
                                    bool = null;
                                    break;
                                } else if (a4.booleanValue() == z6) {
                                    bool = false;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if ((agmv2.f66000a & 2) == 0) {
                                    this.f65277a.mo35497E().f65567f.mo35437a("No number filter for double param. event, param", this.f65277a.mo35541y().mo35422a(str3), this.f65277a.mo35541y().mo35424b(str4));
                                    bool = null;
                                    break;
                                }
                                double doubleValue = ((Double) obj).doubleValue();
                                agmy agmy4 = agmv2.f66002c;
                                if (agmy4 == null) {
                                    agmy4 = agmy.f66006g;
                                }
                                Boolean a5 = m54019a(doubleValue, agmy4);
                                if (a5 == null) {
                                    bool = null;
                                    break;
                                } else if (a5.booleanValue() == z6) {
                                    bool = false;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                int i6 = agmv2.f66000a;
                                if ((i6 & 1) == 0) {
                                    if ((i6 & 2) != 0) {
                                        String str5 = (String) obj;
                                        if (!agmp.m54572a(str5)) {
                                            this.f65277a.mo35497E().f65567f.mo35437a("Invalid param value for number filter. event, param", this.f65277a.mo35541y().mo35422a(str3), this.f65277a.mo35541y().mo35424b(str4));
                                            bool = null;
                                            break;
                                        }
                                        agmy agmy5 = agmv2.f66002c;
                                        if (agmy5 == null) {
                                            agmy5 = agmy.f66006g;
                                        }
                                        bool2 = m54023a(str5, agmy5);
                                    } else {
                                        this.f65277a.mo35497E().f65567f.mo35437a("No filter for String param. event, param", this.f65277a.mo35541y().mo35422a(str3), this.f65277a.mo35541y().mo35424b(str4));
                                        bool = null;
                                        break;
                                    }
                                } else {
                                    String str6 = (String) obj;
                                    agnc agnc = agmv2.f66001b;
                                    if (agnc == null) {
                                        agnc = agnc.f66024f;
                                    }
                                    bool2 = m54024a(str6, agnc, this.f65277a.mo35497E());
                                }
                                if (bool2 == null) {
                                    bool = null;
                                    break;
                                } else if (bool2.booleanValue() == z6) {
                                    bool = false;
                                    break;
                                }
                            } else if (obj == null) {
                                this.f65277a.mo35497E().f65572k.mo35437a("Missing param for filter. event, param", this.f65277a.mo35541y().mo35422a(str3), this.f65277a.mo35541y().mo35424b(str4));
                                bool = false;
                            } else {
                                this.f65277a.mo35497E().f65567f.mo35437a("Unknown param type. event, param", this.f65277a.mo35541y().mo35422a(str3), this.f65277a.mo35541y().mo35424b(str4));
                                bool = null;
                            }
                            i5++;
                        }
                    } else {
                        agnk agnk = (agnk) bxwc4.get(i4);
                        if (hashSet.contains(agnk.f66080b)) {
                            int i7 = agnk.f66079a;
                            if ((i7 & 4) != 0) {
                                bxwc = bxwc4;
                                npVar.put(agnk.f66080b, Long.valueOf(agnk.f66082d));
                            } else {
                                bxwc = bxwc4;
                                if ((i7 & 16) != 0) {
                                    npVar.put(agnk.f66080b, Double.valueOf(agnk.f66083e));
                                } else if ((i7 & 2) == 0) {
                                    this.f65277a.mo35497E().f65567f.mo35437a("Unknown value for param. event, param", this.f65277a.mo35541y().mo35422a(str3), this.f65277a.mo35541y().mo35424b(agnk.f66080b));
                                    bool = null;
                                    break;
                                } else {
                                    npVar.put(agnk.f66080b, agnk.f66081c);
                                }
                            }
                        } else {
                            bxwc = bxwc4;
                        }
                        i4++;
                        bxwc4 = bxwc;
                    }
                }
            }
        }
        agib agib52 = this.f65277a.mo35497E().f65572k;
        if (bool != null) {
        }
        agib52.mo35436a("Event filter result", str2);
        if (bool != null) {
        }
    }
}
