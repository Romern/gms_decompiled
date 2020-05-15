package p000;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import com.android.volley.RequestQueue;
import com.google.android.gms.location.places.personalized.AliasedPlace;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kjg extends keo {

    /* renamed from: c */
    public static final /* synthetic */ int f24238c = 0;

    /* renamed from: d */
    private static final srn f24239d = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    public final RequestQueue f24240a;

    /* renamed from: b */
    public final bebh f24241b;

    /* renamed from: e */
    private final aeky f24242e;

    public kjg(Context context, RequestQueue requestQueue, aeky aeky) {
        this.f24242e = aeky;
        this.f24240a = requestQueue;
        this.f24241b = new bebh(context);
    }

    /* renamed from: a */
    public static bnhe m17912a(rkj rkj) {
        bnha h = bnhe.m109414h();
        HashSet hashSet = new HashSet();
        for (AliasedPlace aliasedPlace : rkj.mo24811e()) {
            List list = (List) aliasedPlace.f79579b.stream().filter(kix.f24228a).distinct().collect(Collectors.toList());
            if (!list.isEmpty() && hashSet.add(aliasedPlace.f79578a)) {
                h.mo67695b(aliasedPlace.f79578a, (String) list.get(0));
            }
        }
        return h.mo67618b();
    }

    /* renamed from: b */
    private final bqgg m17915b(Executor executor) {
        return bqdx.m112673a(bqdx.m112674a(bqdx.m112673a(lqv.m19545a(this.f24242e.mo34287a()), kiu.f24224a, executor), new kiv(this, executor), executor), kiw.f24227a, executor);
    }

    /* renamed from: a */
    private static String m17913a(String str) {
        return Html.fromHtml(str).toString();
    }

    /* renamed from: a */
    public static kje m17914a(kjd kjd) {
        kdg kdg;
        try {
            JSONObject jSONObject = (JSONObject) kjd.mo14480b().get();
            String a = kjd.mo14479a();
            if (!bmwb.m108443a(jSONObject.getString("status"), "OK")) {
                ((bnsl) f24239d.mo68388c()).mo68405a("Status not OK when retrieving postal address.");
                kdg = null;
            } else {
                String string = jSONObject.getJSONObject("result").getString("adr_address");
                bxvd da = kdg.f23871j.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                kdg kdg2 = (kdg) da.f164949b;
                a.getClass();
                kdg2.f23873a |= 128;
                kdg2.f23881i = a;
                Matcher matcher = Pattern.compile("<span class=\"([a-z\\-]+)\">(.*?)</span>").matcher(string);
                boolean z = false;
                while (matcher.find()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (!TextUtils.isEmpty(group) && !TextUtils.isEmpty(group2)) {
                        String a2 = m17913a(group2);
                        if ("country-name".equals(group)) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            kdg kdg3 = (kdg) da.f164949b;
                            a2.getClass();
                            kdg3.f23873a |= 2;
                            kdg3.f23875c = a2;
                            z = true;
                        } else if ("postal-code".equals(group)) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            kdg kdg4 = (kdg) da.f164949b;
                            a2.getClass();
                            kdg4.f23873a |= 4;
                            kdg4.f23876d = a2;
                            z = true;
                        } else if ("region".equals(group)) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            kdg kdg5 = (kdg) da.f164949b;
                            a2.getClass();
                            kdg5.f23873a |= 16;
                            kdg5.f23878f = a2;
                            z = true;
                        } else if ("locality".equals(group)) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            kdg kdg6 = (kdg) da.f164949b;
                            a2.getClass();
                            kdg6.f23873a |= 32;
                            kdg6.f23879g = a2;
                            z = true;
                        } else if ("street-address".equals(group)) {
                            da.mo74043d(a2);
                            z = true;
                        }
                    }
                }
                if (z) {
                    String a3 = m17913a(matcher.replaceAll("$2"));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    kdg kdg7 = (kdg) da.f164949b;
                    a3.getClass();
                    kdg7.f23873a = 1 | kdg7.f23873a;
                    kdg7.f23874b = a3;
                    kdg = (kdg) da.mo74062i();
                } else {
                    kdg = null;
                }
            }
            if (kdg != null) {
                return new khx(kjd.mo14479a(), kdg);
            }
            ((bnsl) f24239d.mo68388c()).mo68405a("Failed to retrieve postal address.");
            return null;
        } catch (InterruptedException | ExecutionException | JSONException e) {
            bnsl bnsl = (bnsl) f24239d.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to retrieve postal address.");
            return null;
        }
    }

    /* renamed from: a */
    public final bqgg mo14431a(Executor executor) {
        return m17915b(executor);
    }

    /* renamed from: a */
    public final bqgg mo14429a(kej kej) {
        return bqdx.m112673a(m17915b(kej.f23934a.f23937a), kio.f24218a, bqfb.INSTANCE);
    }
}
