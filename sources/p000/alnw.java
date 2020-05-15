package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.Audience;
import com.google.android.gms.plus.service.v1whitelisted.models.AudiencesFeed;
import java.util.Formatter;
import java.util.List;

/* renamed from: alnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alnw extends alnb {

    /* renamed from: b */
    private final String f73876b;

    /* renamed from: c */
    private final String f73877c;

    /* renamed from: d */
    private final String f73878d;

    /* renamed from: e */
    private final String f73879e;

    /* renamed from: f */
    private final int f73880f;

    /* renamed from: g */
    private final String f73881g;

    /* renamed from: s */
    private final boolean f73882s;

    public alnw(String str, String str2, int i, alzm alzm, String str3, String str4, String str5, int i2, String str6, boolean z) {
        super(str, i, alzm, str3, "LoadCircles");
        this.f73876b = str2;
        this.f73877c = str3;
        this.f73878d = str4;
        this.f73879e = str5;
        this.f73880f = i2;
        this.f73881g = str6;
        this.f73882s = z;
    }

    /* renamed from: d */
    public final DataHolder mo40606d(Context context) {
        String str;
        String str2;
        int i;
        Context context2 = context;
        String str3 = this.f73876b;
        String str4 = this.f73877c;
        String str5 = this.f73878d;
        String str6 = this.f73879e;
        int i2 = this.f73880f;
        String str7 = this.f73881g;
        boolean z = this.f73882s;
        Bundle bundle = new Bundle();
        bundle.putString("account", str4);
        bundle.putString("pagegaiaid", str5);
        Resources resources = context.getResources();
        Bundle bundle2 = new Bundle();
        bundle2.putString("1", resources.getString(C0126R.string.common_chips_label_public));
        bundle2.putString("3", resources.getString(C0126R.string.common_chips_label_your_circles));
        bundle2.putString("4", resources.getString(C0126R.string.common_chips_label_extended_circles));
        bundle.putBundle("localized_group_names", bundle2);
        alog.m61420a(context2, str4, str5, bundle);
        if (z) {
            almq a = almq.m61303a(context2, 5386);
            amph a2 = almq.m61304a(context2, str4, str5, str3);
            Bundle bundle3 = new Bundle();
            String str8 = null;
            while (true) {
                try {
                    aodl aodl = a.f73784b;
                    ClientContext clientContext = a2.f75659a;
                    String str9 = a2.f75660b;
                    if (str9 == null) {
                        str9 = "me";
                    }
                    String a3 = anxj.m65495a(context);
                    StringBuilder sb = new StringBuilder();
                    amph amph = a2;
                    new Formatter(sb).format("people/%1$s/audiences", shd.m35267a(str9));
                    if (a3 != null) {
                        shd.m35269a(sb, "language", shd.m35267a(a3));
                    }
                    shd.m35269a(sb, "maxResults", String.valueOf((Object) 100));
                    if (str8 != null) {
                        shd.m35269a(sb, "pageToken", shd.m35267a(str8));
                    }
                    AudiencesFeed audiencesFeed = (AudiencesFeed) aodl.f78222a.mo25536a(clientContext, 0, sb.toString(), (Object) null, AudiencesFeed.class);
                    List list = audiencesFeed.f82853d;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Audience audience = (Audience) list.get(i3);
                        if ("circle".equals(audience.f82847c.f83045e)) {
                            String str10 = audience.f82848d;
                            String str11 = audience.f82847c.f83044d;
                            if (!"limited".equals(str10)) {
                                i = !"public".equals(str10) ? "private".equals(str10) ? 3 : 0 : 1;
                            } else {
                                i = 2;
                            }
                            bundle3.putInt(str11, i);
                        }
                    }
                    String str12 = audiencesFeed.f82854e;
                    if (str12 == null) {
                        break;
                    }
                    str8 = str12;
                    a2 = amph;
                } catch (gid e) {
                    Log.e("BasePeopleOperation", "Authentication error", e);
                    bundle3 = null;
                } catch (VolleyError e2) {
                    Object[] objArr = new Object[2];
                    objArr[0] = e2.getMessage();
                    NetworkResponse networkResponse = e2.networkResponse;
                    if (networkResponse != null) {
                        str2 = String.valueOf(networkResponse.statusCode);
                    } else {
                        str2 = "none";
                    }
                    objArr[1] = str2;
                    amdk.m62659b("BasePeopleOperation", "Network error %s [%s]", objArr);
                    bundle3 = null;
                }
            }
            if (bundle3 != null) {
                bundle.putBundle("circlevisibility", bundle3);
            }
        }
        alto b = altq.m61806a(context).mo40763b();
        if (b == null) {
            return DataHolder.m22537a(new String[0]).mo25163a(13);
        }
        String[] strArr = new String[4];
        strArr[0] = Long.toString(altn.m61774a(context).mo40738a(str4, str5));
        strArr[1] = ancm.m64011b(str6);
        strArr[2] = Integer.toString(i2);
        String l = ancm.m64023l(str7);
        if (!TextUtils.isEmpty(l)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(l).length() + 1);
            sb2.append(l);
            sb2.append('%');
            str = sb2.toString();
        } else {
            str = "";
        }
        strArr[3] = str;
        return new DataHolder(b.mo40744a("SELECT _id,circle_id,name,sort_key,people_count,type,client_policies,last_modified,sync_to_contacts,for_sharing FROM circles WHERE (owner_id = ?1)AND ((?2 = '') OR (circle_id = ?2))AND ((?3='-999') OR (?3=type) OR (?3='-998' AND type != -1))AND ((?4 = '') OR (name like ?4 escape '\\')) ORDER BY sort_key", strArr), bundle);
    }
}
