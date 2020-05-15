package p000;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.audience.AudienceSelectionListCircleView;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: anpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anpb extends aonr implements anpq, anqf {

    /* renamed from: E */
    public static final /* synthetic */ int f77340E = 0;

    /* renamed from: A */
    public int f77341A;

    /* renamed from: B */
    public int f77342B;

    /* renamed from: C */
    public int f77343C;

    /* renamed from: D */
    public final ryw f77344D;

    /* renamed from: F */
    private boolean f77345F;

    /* renamed from: G */
    private rtp f77346G;

    /* renamed from: H */
    private List f77347H;

    /* renamed from: I */
    private List f77348I;

    /* renamed from: J */
    private final anox f77349J;

    /* renamed from: K */
    private final aono f77350K;

    /* renamed from: L */
    private aonl f77351L;

    /* renamed from: Q */
    private aonl f77352Q;

    /* renamed from: R */
    private aonl f77353R;

    /* renamed from: S */
    private final rkb f77354S;

    /* renamed from: T */
    private final Map f77355T;

    /* renamed from: a */
    private final anul f77356a;

    /* renamed from: b */
    private final boolean f77357b;

    /* renamed from: c */
    private final int f77358c;

    /* renamed from: d */
    private final int f77359d;

    /* renamed from: e */
    public View.OnClickListener f77360e;

    /* renamed from: f */
    protected final int f77361f;

    /* renamed from: g */
    protected final int f77362g;

    /* renamed from: h */
    protected final int f77363h;

    /* renamed from: i */
    protected final int f77364i;

    /* renamed from: j */
    protected final int f77365j;

    /* renamed from: k */
    protected final int f77366k;

    /* renamed from: l */
    public final anqg f77367l;

    /* renamed from: m */
    public final String f77368m;

    /* renamed from: n */
    public final String f77369n;

    /* renamed from: o */
    public final int f77370o;

    /* renamed from: p */
    public final List f77371p;

    /* renamed from: q */
    public Cursor f77372q;

    /* renamed from: r */
    public PeopleFeed f77373r;

    /* renamed from: s */
    public int f77374s;

    /* renamed from: t */
    public boolean f77375t;

    /* renamed from: u */
    public Context f77376u;

    /* renamed from: v */
    public aonl f77377v;

    /* renamed from: w */
    public aonl f77378w;

    /* renamed from: x */
    public aonl f77379x;

    /* renamed from: y */
    public aonl f77380y;

    /* renamed from: z */
    public aonl f77381z;

    public anpb(Context context, anqg anqg, String str, String str2, boolean z) {
        this(context, anqg, str, str2, z, 0, 0, null, false, anuy.f77749a);
    }

    /* renamed from: a */
    private static final AudienceMember m64911a(aohu aohu) {
        AudienceMember audienceMember = null;
        String str = null;
        String str2 = null;
        audienceMember = null;
        audienceMember = null;
        if (!TextUtils.isEmpty(aohu.mo42768d())) {
            String d = aohu.mo42768d();
            String b = aohu.mo42766b();
            if (aohu.mo42770g()) {
                str = aohu.mo42769f().mo42763b();
            }
            audienceMember = AudienceMember.m22639a(d, b, str);
        } else if (aohu.mo42767c() != null && aohu.mo42767c().size() > 0 && !TextUtils.isEmpty(((aohr) aohu.mo42767c().get(0)).mo42762b())) {
            String b2 = ((aohr) aohu.mo42767c().get(0)).mo42762b();
            String h = ancm.m64019h(b2);
            String b3 = aohu.mo42766b();
            if (aohu.mo42770g()) {
                str2 = aohu.mo42769f().mo42763b();
            }
            audienceMember = AudienceMember.m22641b(h, b3, str2);
            if (!b2.equals(aohu.mo42766b())) {
                audienceMember.f30298h.putString("secondaryText", b2);
            }
        }
        if (audienceMember != null) {
            audienceMember.f30298h.putInt("contactType", 0);
            if (aohu.mo42774k() && aohu.mo42773j().mo42765c()) {
                audienceMember.f30298h.putBoolean("isCircled", aohu.mo42773j().mo42764b());
            }
            if (aohu.mo42772i()) {
                audienceMember.f30298h.putString("objectType", aohu.mo42771h());
            }
        }
        return audienceMember;
    }

    /* renamed from: a */
    private final boolean mo42041a() {
        Audience audience;
        anqg anqg = this.f77367l;
        return (anqg == null || (audience = anqg.f77451a) == null || audience.f30288c != 1) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AudienceSelectionListCircleView mo42063b(alzj alzj, View view, ViewGroup viewGroup, boolean z) {
        AudienceSelectionListCircleView a = mo42039a(alzj, view, viewGroup, z);
        int f = alzj.mo41058f();
        if (f == 1) {
            a.mo46547a((int) C0126R.C0127drawable.plus_ic_public_24dp);
        } else if (f == 2) {
            a.mo46547a((int) C0126R.C0127drawable.plus_ic_domain_24dp);
        } else if (f == 3) {
            a.mo46547a((int) C0126R.C0127drawable.ic_circles_24dp);
        } else if (f == 4) {
            a.mo46547a((int) C0126R.C0127drawable.plus_ic_circles_extended_24dp);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public aonl mo42044c() {
        int i;
        if (this.f77345F) {
            this.f77345F = false;
            if (this.f77346G != null) {
                for (int i2 = 0; i2 < this.f77346G.mo24660a(); i2++) {
                    this.f77355T.remove(((amfa) this.f77346G.mo24661a(i2)).mo25472a());
                }
            }
            if (this.f77371p != null) {
                for (int i3 = 0; i3 < this.f77371p.size(); i3++) {
                    this.f77355T.remove(((AudienceMember) this.f77371p.get(i3)).f30295e);
                }
            }
            if (this.f77347H != null) {
                for (int i4 = 0; i4 < this.f77347H.size(); i4++) {
                    this.f77355T.remove(((AudienceMember) this.f77347H.get(i4)).f30295e);
                }
            }
            this.f77353R = new aonp(this, (int) C0126R.string.plus_audience_selection_header_search, "🔍", new anoz(this, this.f77355T.values()));
        }
        aonl[] aonlArr = new aonl[6];
        aonlArr[0] = this.f77353R;
        aonlArr[1] = this.f77381z;
        if (!this.f77357b) {
            i = 0;
        } else {
            i = C0126R.string.plus_audience_selection_header_circles;
        }
        aonlArr[2] = new aonp(this, i, "◯", new aonk(this.f77377v, this.f77378w));
        aonlArr[3] = this.f77380y;
        aonlArr[4] = !mo42045d() ? this.f77350K : this.f77349J;
        aonlArr[5] = this.f77379x;
        return new aonk(aonlArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo42045d() {
        aonl aonl;
        aonl aonl2 = this.f77377v;
        if (aonl2 != null && !aonl2.mo43095b()) {
            return false;
        }
        aonl aonl3 = this.f77378w;
        if (aonl3 != null && !aonl3.mo43095b()) {
            return false;
        }
        aonl aonl4 = this.f77380y;
        if (aonl4 == null) {
            return true;
        }
        if (!aonl4.mo43095b() || ((aonl = this.f77381z) != null && !aonl.mo43095b())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo42066e() {
        this.f77367l.mo42123a(this);
        this.f77354S.mo24801e();
    }

    /* renamed from: f */
    public void mo42067f() {
        this.f77367l.mo42125b(this);
        this.f77354S.mo24803g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo42068g() {
        mo43104a(mo42044c());
    }

    public final boolean isEnabled(int i) {
        return getItemViewType(i) != this.f78591O;
    }

    public anpb(Context context, anqg anqg, String str, String str2, boolean z, int i, int i2, List list, boolean z2, anul anul) {
        super(context);
        this.f77361f = mo43112i();
        this.f77362g = mo43112i();
        this.f77363h = mo43112i();
        this.f77364i = mo43112i();
        this.f77365j = mo43112i();
        this.f77366k = mo43112i();
        this.f77349J = new anox(this);
        this.f77350K = new aono();
        this.f77355T = new LinkedHashMap();
        this.f77344D = new ryw(5242880);
        this.f77376u = context;
        this.f77367l = anqg;
        this.f77368m = str;
        this.f77369n = str2;
        this.f77357b = z;
        this.f77358c = i;
        this.f77359d = i2;
        this.f77356a = anul;
        this.f77371p = new ArrayList();
        this.f77348I = list;
        this.f77375t = z2;
        this.f77354S = this.f77356a.mo42293a(context, 80, this.f77369n);
        this.f77353R = new aono();
        this.f77370o = context.getResources().getInteger(C0126R.integer.plus_audience_selection_num_suggested_image_columns);
        mo42031a((Object) null);
    }

    /* renamed from: b */
    public final void mo42064b(rtp rtp) {
        if (rtp != null) {
            this.f77351L = new anov(this, rtp);
            this.f77352Q = new anow(this, rtp);
        } else {
            aono aono = new aono();
            this.f77352Q = aono;
            this.f77351L = aono;
        }
        this.f77377v = !mo42041a() ? this.f77351L : this.f77352Q;
        mo42068g();
    }

    /* renamed from: c */
    public final void mo42065c(rtp rtp) {
        this.f77371p.clear();
        this.f77343C = 0;
        this.f77345F = true;
        this.f77346G = rtp;
        int a = rtp.mo24660a();
        for (int i = 0; i < a; i++) {
            amfa amfa = (amfa) rtp.mo24661a(i);
            String c = amfa.mo25474c();
            String a2 = amfa.mo25472a();
            if (!(c == null || a2 == null)) {
                this.f77371p.add(sfh.m35162a(amfa));
            }
        }
        this.f77343C = this.f77371p.size();
        this.f77380y = mo42058a(false);
        mo42068g();
    }

    /* renamed from: a */
    public static final boolean m64913a(alzj alzj, alzj alzj2) {
        if (alzj == null && alzj2 == null) {
            return true;
        }
        if (alzj == null || alzj2 == null) {
            return false;
        }
        return alzj.mo41056c().equals(alzj2.mo41056c());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo42038a(View view, ViewGroup viewGroup, boolean z) {
        int i;
        View a = mo43102a(view, (int) C0126R.C0128layout.plus_audience_selection_list_loading);
        if (a.findViewById(C0126R.C0129id.top_border) != null) {
            View findViewById = a.findViewById(C0126R.C0129id.top_border);
            if (!z) {
                i = 8;
            } else {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
        a.setClickable(true);
        a.setFocusable(true);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final aonl mo42057a(PeopleFeed peopleFeed, Cursor cursor) {
        anpa anpa;
        int i;
        AudienceMember a;
        List list;
        List list2 = this.f77347H;
        if (list2 == null) {
            this.f77347H = new ArrayList();
        } else {
            list2.clear();
        }
        HashSet hashSet = new HashSet();
        if (cursor != null) {
            cursor.moveToPosition(-1);
            while (cursor.moveToNext() && cursor.getPosition() < this.f77374s) {
                String string = cursor.getString(3);
                if (!TextUtils.isEmpty(string)) {
                    String string2 = cursor.getString(2);
                    Uri lookupUri = ContactsContract.Contacts.getLookupUri(cursor.getLong(0), cursor.getString(1));
                    AudienceMember a2 = AudienceMember.m22638a(string, string2);
                    a2.f30298h.putString("contactsAvatarUri", lookupUri.toString());
                    if (!string.equals(string2)) {
                        a2.f30298h.putString("secondaryText", string);
                    }
                    a2.f30298h.putInt("contactType", 1);
                    this.f77347H.add(a2);
                    hashSet.add(string2.toLowerCase());
                }
            }
        }
        if (peopleFeed != null) {
            List list3 = peopleFeed.f83007d;
            for (int i2 = 0; i2 < list3.size(); i2++) {
                aohu aohu = (aohu) list3.get(i2);
                if (!hashSet.contains(aohu.mo42766b().toLowerCase()) && (a = m64911a(aohu)) != null && ((list = this.f77348I) == null || !list.contains(a))) {
                    this.f77347H.add(a);
                }
            }
        }
        this.f77341A = 0;
        this.f77342B = 0;
        anor anor = null;
        if (this.f77347H.size() <= 0) {
            return null;
        }
        int i3 = this.f77358c;
        if (i3 <= 0 || (i = this.f77370o) <= 0) {
            anpa = null;
        } else {
            int min = Math.min(this.f77358c, Math.max(1, i3 / i) * this.f77370o);
            this.f77341A = min;
            int min2 = Math.min(min, this.f77347H.size());
            this.f77341A = min2;
            anpa = new anpa(this, this.f77347H, min2);
        }
        if (this.f77359d > 0 && this.f77341A < this.f77347H.size()) {
            int min3 = Math.min(this.f77359d, this.f77347H.size() - this.f77341A);
            this.f77342B = min3;
            List list4 = this.f77347H;
            int i4 = this.f77341A;
            anor = new anor(this, list4, i4, i4 + min3, 2);
        }
        return new aonp(this, (int) C0126R.string.plus_audience_selection_header_suggested, "★", new aonk(anpa, anor));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final aonl mo42058a(boolean z) {
        ArrayList arrayList = new ArrayList();
        int size = this.f77371p.size();
        String str = null;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = ((AudienceMember) this.f77371p.get(i2)).f30296f;
            if (str2 != null) {
                String substring = str2.length() <= 0 ? "" : str2.substring(0, 1);
                if (!substring.equalsIgnoreCase(str)) {
                    arrayList.add(new aonp(this, str, new anor(this, this.f77371p, i, i2, 0)));
                    str = substring.toUpperCase();
                    i = i2;
                }
            }
        }
        if (str != null) {
            List list = this.f77371p;
            arrayList.add(new aonp(this, str, new anor(this, list, i, list.size(), 0)));
        }
        aonk aonk = new aonk((aonl[]) arrayList.toArray(new aonl[arrayList.size()]));
        if (!z) {
            return aonk;
        }
        return new aonk(aonk, this.f77349J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AudienceSelectionListCircleView mo42039a(alzj alzj, View view, ViewGroup viewGroup, boolean z) {
        AudienceSelectionListCircleView audienceSelectionListCircleView = (AudienceSelectionListCircleView) mo43102a(view, (int) C0126R.C0128layout.plus_audience_selection_list_circle);
        audienceSelectionListCircleView.mo42095a();
        audienceSelectionListCircleView.f77417d = alzj;
        audienceSelectionListCircleView.f82278a.setText(alzj.mo41057d());
        audienceSelectionListCircleView.mo42097b(z);
        int h = alzj.mo41060h();
        if (h < 0) {
            audienceSelectionListCircleView.mo46548b();
        } else {
            audienceSelectionListCircleView.f82279b.setVisibility(0);
            audienceSelectionListCircleView.f82279b.setText(audienceSelectionListCircleView.getContext().getResources().getString(C0126R.string.plus_circle_size_pattern, Integer.valueOf(h)));
        }
        audienceSelectionListCircleView.setChecked(this.f77367l.f77451a.f30287b.contains(sfh.m35161a(alzj)));
        audienceSelectionListCircleView.f77419f = this;
        return audienceSelectionListCircleView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AudienceSelectionListPersonView mo42040a(Object obj, String str, String str2, String str3, String str4, String str5, boolean z, int i, View view, boolean z2, boolean z3, boolean z4) {
        Bitmap bitmap;
        String str6 = str4;
        boolean z5 = z4;
        AudienceSelectionListPersonView audienceSelectionListPersonView = (AudienceSelectionListPersonView) mo43102a(view, i);
        boolean z6 = !z3;
        audienceSelectionListPersonView.mo42095a();
        audienceSelectionListPersonView.f77417d = obj;
        audienceSelectionListPersonView.f82284a.setText(str);
        audienceSelectionListPersonView.mo42097b(z2);
        audienceSelectionListPersonView.f77420g = false;
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView textView = audienceSelectionListPersonView.f82285b;
        if (textView != null) {
            textView.setVisibility(!isEmpty ? 0 : 8);
        }
        TextView textView2 = audienceSelectionListPersonView.f82285b;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        audienceSelectionListPersonView.setChecked(z);
        audienceSelectionListPersonView.f77418e.setEnabled(z5);
        if (!z5) {
            audienceSelectionListPersonView.mo42096a(false);
        }
        audienceSelectionListPersonView.f77419f = this;
        if (ancm.m64020i(str3)) {
            if (!TextUtils.isEmpty(str5)) {
                bitmap = (Bitmap) this.f77344D.mo15546a(str5);
                if (bitmap == null) {
                    new anoo(this, str5, obj, audienceSelectionListPersonView, z6).execute(new Void[0]);
                }
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                mo42060a(audienceSelectionListPersonView, bitmap, z6);
            } else if (!z3) {
                audienceSelectionListPersonView.mo46551a((int) C0126R.C0127drawable.quantum_ic_email_black_24);
            } else {
                audienceSelectionListPersonView.mo46551a((int) C0126R.C0127drawable.default_avatar);
            }
        } else if (str6 != null) {
            Bitmap bitmap2 = (Bitmap) this.f77344D.mo15546a(str6);
            if (bitmap2 != null) {
                mo42060a(audienceSelectionListPersonView, bitmap2, z6);
            } else {
                rjo rjo = allr.f73629a;
                rke a = amcy.m62630a(this.f77354S, str6, 2, 1);
                audienceSelectionListPersonView.f82287h = new anop(a);
                a.mo9458a(new anoq(this, obj, audienceSelectionListPersonView, str4, z6));
            }
        }
        return audienceSelectionListPersonView;
    }

    /* renamed from: a */
    public final void mo42059a(anpr anpr, boolean z) {
        AudienceMember audienceMember;
        Audience audience;
        Object obj = anpr.f77417d;
        if (obj instanceof amfa) {
            amfa amfa = (amfa) obj;
            audienceMember = sfh.m35162a(amfa);
            int i = 3;
            if (anpr.f77420g) {
                audienceMember.f30298h.putInt("selectionSource", 3);
                audienceMember.f30298h.putInt("contactType", 0);
            } else {
                audienceMember.f30298h.putInt("selectionSource", 0);
                Bundle bundle = audienceMember.f30298h;
                if (amfa.mo25476e().length > 0) {
                    i = 2;
                }
                bundle.putInt("contactType", i);
            }
        } else if (obj instanceof alzj) {
            audienceMember = sfh.m35161a((alzj) obj);
        } else if (obj instanceof AudienceMember) {
            audienceMember = (AudienceMember) obj;
        } else {
            return;
        }
        if (!z) {
            audience = sfi.m35165b(this.f77367l.f77451a, audienceMember);
        } else {
            audience = sfi.m35163a(this.f77367l.f77451a, audienceMember);
        }
        this.f77367l.mo42124a(audience, this);
    }

    /* renamed from: a */
    public final void mo42060a(AudienceSelectionListPersonView audienceSelectionListPersonView, Bitmap bitmap, boolean z) {
        if (z) {
            bitmap = ssa.m36185a(bitmap);
        }
        if (bitmap != null) {
            audienceSelectionListPersonView.f82286c.setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public final void mo42061a(PeopleFeed peopleFeed) {
        boolean z = true;
        this.f77345F = true;
        List list = peopleFeed.f83007d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AudienceMember a = m64911a((aohu) list.get(i));
            if (a != null) {
                this.f77371p.add(a);
            }
        }
        this.f77343C = this.f77371p.size();
        if (peopleFeed.f83008e == null) {
            z = false;
        }
        this.f77380y = mo42058a(z);
        mo42068g();
    }

    /* renamed from: a */
    public final void mo42031a(Object obj) {
        Audience audience;
        if (obj != this) {
            anqg anqg = this.f77367l;
            if (anqg == null || (audience = anqg.f77451a) == null) {
                String valueOf = String.valueOf(anqg);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 60);
                sb.append("Couldn't build audience blocks, unexpected selectionState = ");
                sb.append(valueOf);
                Log.e("AudienceSelectionAdapter", sb.toString());
                return;
            }
            for (AudienceMember audienceMember : audience.f30287b) {
                if (audienceMember.mo17847c() && !this.f77355T.containsKey(audienceMember.f30295e)) {
                    this.f77345F = true;
                    this.f77355T.put(audienceMember.f30295e, sfh.m35160a(audienceMember));
                }
            }
            this.f77377v = !mo42041a() ? this.f77351L : this.f77352Q;
            mo42068g();
            return;
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo42062a(rtp rtp) {
        if (rtp != null) {
            this.f77378w = new anos(this, rtp);
        } else {
            this.f77378w = new aono();
        }
        mo42068g();
    }
}
