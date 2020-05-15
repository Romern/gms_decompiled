package p000;

import android.content.Intent;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.model.posts.PlusPage;
import java.util.ArrayList;

/* renamed from: aomv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aomv {

    /* renamed from: a */
    public String f78529a;

    /* renamed from: b */
    public PlusPage f78530b;

    /* renamed from: c */
    public String f78531c;

    /* renamed from: d */
    public int f78532d;

    /* renamed from: e */
    public String f78533e;

    /* renamed from: f */
    public String f78534f;

    /* renamed from: g */
    public String f78535g;

    /* renamed from: h */
    public String f78536h;

    /* renamed from: i */
    public int f78537i;

    /* renamed from: j */
    public boolean f78538j;

    /* renamed from: k */
    public boolean f78539k;

    /* renamed from: l */
    public boolean f78540l;

    /* renamed from: m */
    public String f78541m;

    /* renamed from: n */
    public String f78542n;

    /* renamed from: o */
    public aona f78543o;

    /* renamed from: p */
    public aomz f78544p;

    /* renamed from: q */
    public Audience f78545q;

    /* renamed from: r */
    public AudienceMember f78546r;

    /* renamed from: s */
    public String f78547s;

    public aomv(Intent intent) {
        Audience audience;
        CharSequence charSequenceExtra;
        this.f78529a = intent.getStringExtra("com.google.android.gms.plus.intent.extra.ACCOUNT");
        this.f78542n = intent.getStringExtra("com.google.android.apps.plus.CONTENT_URL");
        this.f78543o = aona.m66118a(intent.getExtras());
        this.f78544p = aomz.m66116a(intent.getBundleExtra("com.google.android.apps.plus.CALL_TO_ACTION"));
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_IDS");
        if (stringArrayListExtra != null) {
            int size = stringArrayListExtra.size();
            ArrayList arrayList = new ArrayList(size);
            int intValue = ((Integer) ansx.f77651A.mo25081c()).intValue();
            int i = 0;
            while (i < size && i < intValue) {
                arrayList.add(AudienceMember.m22639a(stringArrayListExtra.get(i), null, null));
                i++;
            }
            if (size != arrayList.size()) {
                StringBuilder sb = new StringBuilder(90);
                sb.append("Only ");
                sb.append(intValue);
                sb.append(" recipients can be pre-populated in a post.  Some recipients were removed.");
                Log.w("GooglePlusPlatform", sb.toString());
            }
            sfd sfd = new sfd();
            sfd.mo25467a(arrayList);
            audience = sfd.mo25465a();
        } else {
            audience = null;
        }
        this.f78545q = audience;
        this.f78546r = (AudienceMember) intent.getParcelableExtra("com.google.android.gms.plus.intent.extra.INTERNAL_PREFILLED_PLUS_MENTION");
        this.f78537i = 0;
        this.f78538j = ((Boolean) ansx.f77670T.mo25081c()).booleanValue();
        this.f78539k = ((Boolean) ansx.f77671U.mo25081c()).booleanValue();
        this.f78540l = ((Boolean) ansx.f77672V.mo25081c()).booleanValue();
        if (intent.hasExtra("android.intent.extra.TEXT")) {
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            this.f78547s = stringExtra;
            if (stringExtra == null && (charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT")) != null) {
                this.f78547s = charSequenceExtra.toString();
            }
        }
        if (mo43054f()) {
            mo43048a(this.f78543o.mo43071c());
        }
        if (mo43056h()) {
            String str = this.f78547s;
            mo43048a(str);
            if (this.f78542n != null && str != null && str.trim().equals(this.f78542n)) {
                this.f78547s = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43048a(String str) {
        if (!TextUtils.isEmpty(str)) {
            SpannableString spannableString = new SpannableString(str);
            Linkify.addLinks(spannableString, 1);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
            if (uRLSpanArr.length > 0) {
                this.f78542n = uRLSpanArr[0].getURL();
            }
        }
    }

    /* renamed from: b */
    public final String mo43050b() {
        if (mo43051c()) {
            return this.f78530b.f82548b;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo43051c() {
        PlusPage plusPage = this.f78530b;
        return plusPage != null && !TextUtils.isEmpty(plusPage.f82548b);
    }

    /* renamed from: d */
    public final boolean mo43052d() {
        return this.f78541m != null;
    }

    /* renamed from: e */
    public final boolean mo43053e() {
        return !TextUtils.isEmpty(this.f78542n);
    }

    /* renamed from: f */
    public final boolean mo43054f() {
        return this.f78543o != null;
    }

    /* renamed from: g */
    public final boolean mo43055g() {
        return this.f78544p != null;
    }

    /* renamed from: h */
    public final boolean mo43056h() {
        return !TextUtils.isEmpty(this.f78547s);
    }

    /* renamed from: a */
    public final boolean mo43049a() {
        return !TextUtils.isEmpty(this.f78529a);
    }
}
