package p000;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcuo {
    /* JADX WARNING: Removed duplicated region for block: B:111:0x026a A[Catch:{ JSONException -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02b8 A[Catch:{ JSONException -> 0x02e4 }, LOOP:0: B:3:0x0015->B:123:0x02b8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02cd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0273 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0218 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0205 A[Catch:{ JSONException -> 0x0231 }, LOOP:3: B:50:0x00ed->B:96:0x0205, LOOP_END] */
    /* renamed from: a */
    public static bmxv m90041a(JSONObject jSONObject) {
        JSONArray jSONArray;
        String str;
        String str2;
        String str3;
        bmxv bmxv;
        bmxv bmxv2;
        bmxv bmxv3;
        bmxv bmxv4;
        String str4 = "FORMATTED_TEXT_SPANS";
        String str5 = "LINE_STYLE";
        String str6 = "PREDEFINED_STYLE";
        bngs j = bngx.m109377j();
        try {
            JSONArray jSONArray2 = jSONObject.getJSONArray("FORMATTED_LINES");
            int i = 0;
            while (i < jSONArray2.length()) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                bcua f = bcub.m89996f();
                try {
                    f.mo57562a(jSONObject2.getString("RAW_TEXT"));
                    if (jSONObject2.has(str6)) {
                        f.mo57560a(bcui.m90016a(jSONObject2.getInt(str6)));
                    }
                    if (jSONObject2.has(str5)) {
                        bngs j2 = bngx.m109377j();
                        JSONArray jSONArray3 = jSONObject2.getJSONArray(str5);
                        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                            JSONObject jSONObject3 = jSONArray3.getJSONObject(i2);
                            try {
                                bcul bcul = bcul.UNKNOWN;
                                bcug bcug = bcug.UNKNOWN;
                                int ordinal = bcug.m90014a(jSONObject3.getInt("TYPE")).ordinal();
                                if (ordinal == 0) {
                                    bmxv4 = bmxv.m108566b(bcqk.f104677a);
                                } else if (ordinal == 1) {
                                    bmxv4 = bmxv.m108566b(bcqm.m89633a(jSONObject3.getInt("INDENTATION")));
                                } else if (ordinal != 2) {
                                    bmxv4 = bmvz.f131120a;
                                } else {
                                    bmxv4 = bmxv.m108566b(bcqi.f104675a);
                                }
                            } catch (JSONException e) {
                                bbos.m88292b("RICH_TEXT", "Failed to get LineStyle from JSONObject.", e);
                            }
                            if (bmxv4.mo66813a()) {
                                j2.mo67668c((bcue) bmxv4.mo66814b());
                            }
                        }
                        f.mo57563b(j2.mo67664a());
                    }
                    if (jSONObject2.has(str4)) {
                        bngs j3 = bngx.m109377j();
                        JSONArray jSONArray4 = jSONObject2.getJSONArray(str4);
                        int i3 = 0;
                        while (i3 < jSONArray4.length()) {
                            JSONObject jSONObject4 = jSONArray4.getJSONObject(i3);
                            bcuc e2 = bcud.m90006e();
                            try {
                                e2.mo57567b(jSONObject4.getInt("START_INDEX"));
                                e2.mo57565a(jSONObject4.getInt("END_INDEX"));
                                bngs j4 = bngx.m109377j();
                                JSONArray jSONArray5 = jSONObject4.getJSONArray("TEXT_STYLE_LIST");
                                str3 = str4;
                                int i4 = 0;
                                while (true) {
                                    try {
                                        if (i4 < jSONArray5.length()) {
                                            JSONObject jSONObject5 = jSONArray5.getJSONObject(i4);
                                            try {
                                                bcul bcul2 = bcul.UNKNOWN;
                                                bcug bcug2 = bcug.UNKNOWN;
                                                str = str5;
                                                switch (bcul.m90038a(jSONObject5.getInt("TYPE")).ordinal()) {
                                                    case 0:
                                                        str2 = str6;
                                                        jSONArray = jSONArray2;
                                                        bmxv3 = bmxv.m108566b(bcuj.m90017n());
                                                        if (!bmxv3.mo66813a()) {
                                                            bmxv2 = bmvz.f131120a;
                                                            break;
                                                        } else {
                                                            j4.mo67668c((bcuj) bmxv3.mo66814b());
                                                            i4++;
                                                            str6 = str2;
                                                            str5 = str;
                                                            jSONArray2 = jSONArray;
                                                        }
                                                    case 1:
                                                        str2 = str6;
                                                        jSONArray = jSONArray2;
                                                        bmxv3 = bmxv.m108566b(bcuj.m90018o());
                                                        if (!bmxv3.mo66813a()) {
                                                        }
                                                        break;
                                                    case 2:
                                                        str2 = str6;
                                                        jSONArray = jSONArray2;
                                                        bmxv3 = bmxv.m108566b(bcuj.m90019p());
                                                        if (!bmxv3.mo66813a()) {
                                                        }
                                                        break;
                                                    case 3:
                                                        str2 = str6;
                                                        jSONArray = jSONArray2;
                                                        bmxv3 = bmxv.m108566b(bcuj.m90020q());
                                                        if (!bmxv3.mo66813a()) {
                                                        }
                                                        break;
                                                    case 4:
                                                        str2 = str6;
                                                        jSONArray = jSONArray2;
                                                        bmxv3 = bmxv.m108566b(bcuj.m90021r());
                                                        if (!bmxv3.mo66813a()) {
                                                        }
                                                        break;
                                                    case 5:
                                                        str2 = str6;
                                                        jSONArray = jSONArray2;
                                                        bmxv3 = bmxv.m108566b(bcuj.m90022s());
                                                        if (!bmxv3.mo66813a()) {
                                                        }
                                                        break;
                                                    case 6:
                                                        str2 = str6;
                                                        jSONArray = jSONArray2;
                                                        bmxv3 = bmxv.m108566b(bcuj.m90023t());
                                                        if (!bmxv3.mo66813a()) {
                                                        }
                                                        break;
                                                    case 7:
                                                        str2 = str6;
                                                        jSONArray = jSONArray2;
                                                        bmxv3 = bmxv.m108566b(bcra.m89670a(jSONObject5.getInt("STYLE")));
                                                        if (!bmxv3.mo66813a()) {
                                                        }
                                                        break;
                                                    case 8:
                                                        str2 = str6;
                                                        jSONArray = jSONArray2;
                                                        bmxv3 = bmxv.m108566b(bcra.m89672b(jSONObject5.getInt("STYLE")));
                                                        if (!bmxv3.mo66813a()) {
                                                        }
                                                        break;
                                                    case 9:
                                                        str2 = str6;
                                                        jSONArray = jSONArray2;
                                                        bmxv3 = bmxv.m108566b(bcra.m89673c(jSONObject5.getInt("STYLE")));
                                                        if (!bmxv3.mo66813a()) {
                                                        }
                                                        break;
                                                    case 10:
                                                        str2 = str6;
                                                        try {
                                                            bngs j5 = bngx.m109377j();
                                                            JSONArray jSONArray6 = jSONObject5.getJSONArray("STYLE");
                                                            int i5 = 0;
                                                            while (true) {
                                                                jSONArray = jSONArray2;
                                                                try {
                                                                    if (i5 >= jSONArray6.length()) {
                                                                        bmxv3 = bmxv.m108566b(bcra.m89671a(j5.mo67664a()));
                                                                        if (!bmxv3.mo66813a()) {
                                                                        }
                                                                    } else {
                                                                        j5.mo67668c(bcun.m90040a(jSONArray6.getInt(i5)));
                                                                        i5++;
                                                                        jSONArray2 = jSONArray;
                                                                    }
                                                                } catch (JSONException e3) {
                                                                    try {
                                                                        bbos.m88294d("RICH_TEXT", "Failed to get TextStyle from JSONObject");
                                                                        bmxv3 = bmvz.f131120a;
                                                                        if (!bmxv3.mo66813a()) {
                                                                        }
                                                                    } catch (JSONException e4) {
                                                                        e = e4;
                                                                        String valueOf = String.valueOf(e);
                                                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                                                                        sb.append("Failed to get FormattedTextSpan from JSONObject. ");
                                                                        sb.append(valueOf);
                                                                        bbos.m88294d("FormattedTextSpan", sb.toString());
                                                                        bmxv2 = bmvz.f131120a;
                                                                        if (!bmxv2.mo66813a()) {
                                                                        }
                                                                        i3++;
                                                                        str4 = str3;
                                                                        str6 = str2;
                                                                        str5 = str;
                                                                        jSONArray2 = jSONArray;
                                                                    }
                                                                }
                                                            }
                                                        } catch (JSONException e5) {
                                                            jSONArray = jSONArray2;
                                                            bbos.m88294d("RICH_TEXT", "Failed to get TextStyle from JSONObject");
                                                            bmxv3 = bmvz.f131120a;
                                                            if (!bmxv3.mo66813a()) {
                                                            }
                                                        }
                                                        break;
                                                    case 11:
                                                        try {
                                                            bmxv3 = bmxv.m108566b(bcra.m89674d(jSONObject5.getInt("STYLE")));
                                                            str2 = str6;
                                                            jSONArray = jSONArray2;
                                                        } catch (JSONException e6) {
                                                            str2 = str6;
                                                            jSONArray = jSONArray2;
                                                            bbos.m88294d("RICH_TEXT", "Failed to get TextStyle from JSONObject");
                                                            bmxv3 = bmvz.f131120a;
                                                            if (!bmxv3.mo66813a()) {
                                                            }
                                                        }
                                                        if (!bmxv3.mo66813a()) {
                                                        }
                                                        break;
                                                    default:
                                                        str2 = str6;
                                                        jSONArray = jSONArray2;
                                                        bmxv3 = bmvz.f131120a;
                                                        if (!bmxv3.mo66813a()) {
                                                        }
                                                        break;
                                                }
                                            } catch (JSONException e7) {
                                                str = str5;
                                                str2 = str6;
                                                jSONArray = jSONArray2;
                                                bbos.m88294d("RICH_TEXT", "Failed to get TextStyle from JSONObject");
                                                bmxv3 = bmvz.f131120a;
                                                if (!bmxv3.mo66813a()) {
                                                }
                                            }
                                        } else {
                                            str = str5;
                                            str2 = str6;
                                            jSONArray = jSONArray2;
                                            e2.mo57566a(j4.mo67664a());
                                            try {
                                                bmxv2 = bmxv.m108566b(e2.mo57564a());
                                            } catch (JSONException e8) {
                                                e = e8;
                                                bbos.m88292b("RICH_TEXT", "Failed to get Formatted Line from JSONObject.", e);
                                                bmxv = bmvz.f131120a;
                                                if (!bmxv.mo66813a()) {
                                                }
                                            }
                                        }
                                    } catch (JSONException e9) {
                                        e = e9;
                                        str = str5;
                                        str2 = str6;
                                        jSONArray = jSONArray2;
                                        String valueOf2 = String.valueOf(e);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                                        sb2.append("Failed to get FormattedTextSpan from JSONObject. ");
                                        sb2.append(valueOf2);
                                        bbos.m88294d("FormattedTextSpan", sb2.toString());
                                        bmxv2 = bmvz.f131120a;
                                        if (!bmxv2.mo66813a()) {
                                        }
                                        i3++;
                                        str4 = str3;
                                        str6 = str2;
                                        str5 = str;
                                        jSONArray2 = jSONArray;
                                    }
                                }
                            } catch (JSONException e10) {
                                e = e10;
                                str3 = str4;
                                str = str5;
                                str2 = str6;
                                jSONArray = jSONArray2;
                                String valueOf22 = String.valueOf(e);
                                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 49);
                                sb22.append("Failed to get FormattedTextSpan from JSONObject. ");
                                sb22.append(valueOf22);
                                bbos.m88294d("FormattedTextSpan", sb22.toString());
                                bmxv2 = bmvz.f131120a;
                                if (!bmxv2.mo66813a()) {
                                }
                                i3++;
                                str4 = str3;
                                str6 = str2;
                                str5 = str;
                                jSONArray2 = jSONArray;
                            }
                            if (!bmxv2.mo66813a()) {
                                j3.mo67668c((bcud) bmxv2.mo66814b());
                            }
                            i3++;
                            str4 = str3;
                            str6 = str2;
                            str5 = str;
                            jSONArray2 = jSONArray;
                        }
                        str3 = str4;
                        str = str5;
                        str2 = str6;
                        jSONArray = jSONArray2;
                        f.mo57561a(j3.mo67664a());
                    } else {
                        str3 = str4;
                        str = str5;
                        str2 = str6;
                        jSONArray = jSONArray2;
                    }
                    bmxv = bmxv.m108566b(f.mo57559a());
                } catch (JSONException e11) {
                    e = e11;
                    str3 = str4;
                    str = str5;
                    str2 = str6;
                    jSONArray = jSONArray2;
                    bbos.m88292b("RICH_TEXT", "Failed to get Formatted Line from JSONObject.", e);
                    bmxv = bmvz.f131120a;
                    if (!bmxv.mo66813a()) {
                    }
                }
                if (!bmxv.mo66813a()) {
                    return bmvz.f131120a;
                }
                j.mo67668c((bcub) bmxv.mo66814b());
                i++;
                str4 = str3;
                str6 = str2;
                str5 = str;
                jSONArray2 = jSONArray;
            }
            bctz c = m90042c();
            c.mo57558a(j.mo67664a());
            return bmxv.m108566b(c.mo57557a());
        } catch (JSONException e12) {
            bbos.m88294d("RICH_TEXT", "Failed to get RichText from JSONObject. ");
            return bmvz.f131120a;
        }
    }

    /* renamed from: c */
    public static bctz m90042c() {
        return new bctz();
    }

    /* renamed from: a */
    public abstract bngx mo57034a();

    /* renamed from: b */
    public boolean mo57401b() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0193 A[Catch:{ JSONException -> 0x01a9 }, LOOP:3: B:39:0x010d->B:62:0x0193, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01fa A[LOOP:0: B:1:0x0012->B:79:0x01fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0203 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x019c A[SYNTHETIC] */
    /* renamed from: d */
    public final bmxv mo57568d() {
        bmxv bmxv;
        bmxv bmxv2;
        bmxv bmxv3;
        bmxv bmxv4;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        bnre i = mo57034a().listIterator();
        while (i.hasNext()) {
            bcub bcub = (bcub) i.next();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("RAW_TEXT", bcub.mo57038a());
                if (bcub.mo57039b().mo66813a()) {
                    jSONObject2.put("PREDEFINED_STYLE", ((bcui) bcub.mo57039b().mo66814b()).f104926g);
                }
                if (bcub.mo57040c().mo66813a()) {
                    JSONArray jSONArray2 = new JSONArray();
                    bnre i2 = ((bngx) bcub.mo57040c().mo66814b()).listIterator();
                    while (i2.hasNext()) {
                        bcue bcue = (bcue) i2.next();
                        JSONObject jSONObject3 = new JSONObject();
                        try {
                            jSONObject3.put("TYPE", bcue.mo57214a().f104917d);
                            bcul bcul = bcul.UNKNOWN;
                            bcug bcug = bcug.UNKNOWN;
                            if (bcue.mo57214a().ordinal() == 1) {
                                jSONObject3.put("INDENTATION", bcue.mo57218b());
                            }
                            bmxv4 = bmxv.m108566b(jSONObject3);
                        } catch (JSONException e) {
                            bbos.m88292b("RICH_TEXT", "Failed to convert LineStyle to JSONObject", e);
                            bmxv4 = bmvz.f131120a;
                        }
                        if (bmxv4.mo66813a()) {
                            jSONArray2.put(bmxv4.mo66814b());
                        } else {
                            bmxv = bmvz.f131120a;
                            if (!bmxv.mo66813a()) {
                                return bmvz.f131120a;
                            }
                            jSONArray.put(bmxv.mo66814b());
                        }
                    }
                    jSONObject2.put("LINE_STYLE", jSONArray2);
                }
                if (bcub.mo57041d().mo66813a()) {
                    JSONArray jSONArray3 = new JSONArray();
                    bnre i3 = ((bngx) bcub.mo57041d().mo66814b()).listIterator();
                    while (i3.hasNext()) {
                        bcud bcud = (bcud) i3.next();
                        JSONObject jSONObject4 = new JSONObject();
                        try {
                            jSONObject4.put("START_INDEX", bcud.mo57045a());
                            jSONObject4.put("END_INDEX", bcud.mo57046b());
                            JSONArray jSONArray4 = new JSONArray();
                            bnre i4 = bcud.mo57047c().listIterator();
                            while (true) {
                                if (i4.hasNext()) {
                                    bcuj bcuj = (bcuj) i4.next();
                                    JSONObject jSONObject5 = new JSONObject();
                                    try {
                                        jSONObject5.put("TYPE", bcuj.mo57226b().f104941m);
                                        bcul bcul2 = bcul.UNKNOWN;
                                        bcug bcug2 = bcug.UNKNOWN;
                                        switch (bcuj.mo57226b().ordinal()) {
                                            case 7:
                                                jSONObject5.put("STYLE", bcuj.mo57234d());
                                                bmxv3 = bmxv.m108566b(jSONObject5);
                                                if (bmxv3.mo66813a()) {
                                                    bmxv2 = bmvz.f131120a;
                                                    break;
                                                } else {
                                                    jSONArray4.put(bmxv3.mo66814b());
                                                }
                                            case 8:
                                                jSONObject5.put("STYLE", bcuj.mo57225a());
                                                bmxv3 = bmxv.m108566b(jSONObject5);
                                                if (bmxv3.mo66813a()) {
                                                }
                                                break;
                                            case 9:
                                                jSONObject5.put("STYLE", bcuj.mo57247g());
                                                bmxv3 = bmxv.m108566b(jSONObject5);
                                                if (bmxv3.mo66813a()) {
                                                }
                                                break;
                                            case 10:
                                                JSONArray jSONArray5 = new JSONArray();
                                                bnre i5 = bcuj.mo57264k().listIterator();
                                                while (i5.hasNext()) {
                                                    jSONArray5.put(((bcun) i5.next()).f104953j);
                                                }
                                                jSONObject5.put("STYLE", jSONArray5);
                                                bmxv3 = bmxv.m108566b(jSONObject5);
                                                if (bmxv3.mo66813a()) {
                                                }
                                                break;
                                            case 11:
                                                jSONObject5.put("STYLE", bcuj.mo57238e());
                                                bmxv3 = bmxv.m108566b(jSONObject5);
                                                if (bmxv3.mo66813a()) {
                                                }
                                                break;
                                            default:
                                                bmxv3 = bmxv.m108566b(jSONObject5);
                                                if (bmxv3.mo66813a()) {
                                                }
                                                break;
                                        }
                                    } catch (JSONException e2) {
                                        bbos.m88294d("RICH_TEXT", "Failed to convert text style to JSONObject");
                                        bmxv3 = bmvz.f131120a;
                                    }
                                } else {
                                    jSONObject4.put("TEXT_STYLE_LIST", jSONArray4);
                                    bmxv2 = bmxv.m108566b(jSONObject4);
                                }
                            }
                        } catch (JSONException e3) {
                            String valueOf = String.valueOf(e3);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                            sb.append("Failed to convert FormattedTextSpan to JSONObject. ");
                            sb.append(valueOf);
                            bbos.m88294d("FormattedTextSpan", sb.toString());
                            bmxv2 = bmvz.f131120a;
                        }
                        if (bmxv2.mo66813a()) {
                            jSONArray3.put(bmxv2.mo66814b());
                        } else {
                            bmxv = bmvz.f131120a;
                            if (!bmxv.mo66813a()) {
                            }
                        }
                    }
                    jSONObject2.put("FORMATTED_TEXT_SPANS", jSONArray3);
                }
                bmxv = bmxv.m108566b(jSONObject2);
            } catch (JSONException e4) {
                bbos.m88292b("RICH_TEXT", "Failed to convert FormattedLine to JSONObject.", e4);
                bmxv = bmvz.f131120a;
            }
            if (!bmxv.mo66813a()) {
            }
        }
        try {
            jSONObject.put("FORMATTED_LINES", jSONArray);
            return bmxv.m108566b(jSONObject);
        } catch (JSONException e5) {
            bbos.m88294d("RICH_TEXT", "Failed to convert RichText to JSONObject. ");
            return bmvz.f131120a;
        }
    }
}
