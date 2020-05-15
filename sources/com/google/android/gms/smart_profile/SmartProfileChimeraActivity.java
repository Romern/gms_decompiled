package com.google.android.gms.smart_profile;

import android.accounts.Account;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.ContactsContract;
import android.support.p002v7.widget.Toolbar;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import com.google.android.gms.smart_profile.header.view.HeaderView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmartProfileChimeraActivity extends deu implements aqqh {

    /* renamed from: b */
    public ClientContext f107714b;

    /* renamed from: c */
    public boolean f107715c;

    /* renamed from: d */
    public boolean f107716d;

    /* renamed from: e */
    public String f107717e;

    /* renamed from: f */
    public String f107718f;

    /* renamed from: g */
    public String f107719g;

    /* renamed from: h */
    public Integer f107720h;

    /* renamed from: i */
    public int f107721i;

    /* renamed from: j */
    public byug f107722j = byug.UNKNOWN_APPLICATION;

    /* renamed from: k */
    public String f107723k;

    /* renamed from: l */
    public boolean f107724l;

    /* renamed from: m */
    public boolean f107725m;

    /* renamed from: n */
    public aqqu f107726n;

    /* renamed from: o */
    public Toolbar f107727o;

    /* renamed from: p */
    private aqre f107728p;

    static {
        C1353sk.m20237n();
    }

    /* renamed from: b */
    public final void mo48071b() {
        if (!cgnz.m146325b()) {
            m92508a(true);
        } else if (getResources().getConfiguration().orientation == 2) {
            m92508a(true);
        }
    }

    /* renamed from: c */
    public final void mo48072c() {
        if (!cgnz.m146325b()) {
            m92508a(false);
        } else if (getResources().getConfiguration().orientation == 2) {
            m92508a(false);
        }
    }

    /* renamed from: d */
    public final void mo48073d() {
        if (cgnz.m146325b()) {
            m92508a(true);
        }
    }

    /* renamed from: e */
    public final void mo48074e() {
        if (cgnz.m146325b()) {
            m92508a(false);
        }
    }

    public final void finish() {
        aqre aqre = this.f107728p;
        super.finish();
        aqre.f86656o.overridePendingTransition(0, 0);
    }

    /* renamed from: g */
    public final void mo58991g() {
        SmartProfileContainerView smartProfileContainerView = this.f107728p.f86645d;
        if (smartProfileContainerView != null) {
            smartProfileContainerView.mo58996c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        aqre aqre = this.f107728p;
        if (i == 1 || i == 2) {
            aqwm aqwm = aqre.f86654m;
            aqwm.f86977a.restartLoader(9, null, new aqwk(aqwm, new aqrd(aqre)));
        }
    }

    public final void onBackPressed() {
        mo58991g();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        bzhm bzhm;
        Bundle bundle2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        Bundle bundle3 = bundle;
        super.onCreate(bundle);
        if (cgnz.m146325b()) {
            if (cgnt.m146316b()) {
                setTheme(C0126R.style.PeopleSheetDayNight);
            } else {
                setTheme(C0126R.style.PeopleSheet);
            }
        }
        aqre aqre = new aqre(this);
        this.f107728p = aqre;
        if (!cgnz.m146325b()) {
            aqre.f86656o.setContentView((int) C0126R.C0128layout.profile_activity);
        } else if (cgnb.f187343a.mo6606a().mo84144d()) {
            aqre.f86656o.setContentView((int) C0126R.C0128layout.gm_profile_activity_bugfix);
        } else {
            aqre.f86656o.setContentView((int) C0126R.C0128layout.gm_profile_activity);
        }
        SmartProfileChimeraActivity smartProfileChimeraActivity = aqre.f86656o;
        int i = Build.VERSION.SDK_INT;
        smartProfileChimeraActivity.findViewById(C0126R.C0129id.sp_background).setImportantForAccessibility(2);
        aqre.f86645d = (SmartProfileContainerView) aqre.f86656o.findViewById(C0126R.C0129id.smart_profile_container);
        SmartProfileContainerView smartProfileContainerView = aqre.f86645d;
        SmartProfileChimeraActivity smartProfileChimeraActivity2 = aqre.f86656o;
        smartProfileContainerView.f107735g = smartProfileChimeraActivity2;
        aqre.f86646e = (HeaderView) smartProfileChimeraActivity2.findViewById(C0126R.C0129id.header_view);
        SmartProfileChimeraActivity smartProfileChimeraActivity3 = aqre.f86656o;
        smartProfileChimeraActivity3.overridePendingTransition(0, 0);
        Intent intent = smartProfileChimeraActivity3.getIntent();
        cgnw.f187382a.mo6606a().mo84173a();
        smartProfileChimeraActivity3.f107719g = spn.m35852a((Activity) smartProfileChimeraActivity3);
        if (rfz.m33557a(smartProfileChimeraActivity3).mo24610b(smartProfileChimeraActivity3.f107719g)) {
            if (intent.hasExtra("com.google.android.gms.people.smart_profile.CALLING_PACKAGE")) {
                smartProfileChimeraActivity3.f107719g = intent.getStringExtra("com.google.android.gms.people.smart_profile.CALLING_PACKAGE");
            }
            smartProfileChimeraActivity3.f107722j = byug.THIRD_PARTY;
            if (intent.hasExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID")) {
                byug a = byug.m125352a(intent.getIntExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", 0));
                smartProfileChimeraActivity3.f107722j = a;
                if (a == null) {
                    smartProfileChimeraActivity3.f107722j = byug.UNKNOWN_APPLICATION;
                }
                smartProfileChimeraActivity3.f107720h = tey.m36890a(intent);
                if (cgnz.m146325b()) {
                    smartProfileChimeraActivity3.f107721i = thh.m36964a(smartProfileChimeraActivity3);
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        num = 0;
                    } else {
                        num = Integer.valueOf(extras.getInt("com.google.android.gms.people.smart_profile.STATUS_BAR_COLOR", 0));
                    }
                    smartProfileChimeraActivity3.f107721i = num.intValue();
                }
                int i2 = Build.VERSION.SDK_INT;
                smartProfileChimeraActivity3.getWindow().setStatusBarColor(0);
                smartProfileChimeraActivity3.f107715c = bundle3 != null && bundle3.getBoolean("impressionsLogged");
                smartProfileChimeraActivity3.f107716d = bundle3 != null && bundle3.getBoolean("isError");
                smartProfileChimeraActivity3.f107724l = bundle3 != null && bundle3.getBoolean("firstCardDurationLogged");
                smartProfileChimeraActivity3.f107725m = bundle3 != null && bundle3.getBoolean("allCardsDurationLogged");
                smartProfileChimeraActivity3.f107717e = intent.getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME");
                if (!cgol.f187398a.mo6606a().mo84184a()) {
                    String stringExtra = intent.getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID");
                    smartProfileChimeraActivity3.f107718f = stringExtra;
                    if (stringExtra != null && smartProfileChimeraActivity3.f107717e == null) {
                        smartProfileChimeraActivity3.f107716d = true;
                        Toast.makeText(smartProfileChimeraActivity3, (int) C0126R.string.profile_error, 0).show();
                        smartProfileChimeraActivity3.mo58991g();
                        return;
                    }
                }
                if (cgoc.f187388a.mo6606a().mo84178b()) {
                    ClientContext clientContext = new ClientContext();
                    clientContext.f30212b = Process.myUid();
                    clientContext.f30215e = smartProfileChimeraActivity3.getPackageName();
                    clientContext.f30216f = smartProfileChimeraActivity3.getPackageName();
                    clientContext.mo17806d(cgoc.f187388a.mo6606a().mo84177a());
                    smartProfileChimeraActivity3.f107714b = clientContext;
                } else {
                    ClientContext clientContext2 = new ClientContext();
                    clientContext2.f30212b = Process.myUid();
                    clientContext2.f30215e = smartProfileChimeraActivity3.getPackageName();
                    clientContext2.f30216f = smartProfileChimeraActivity3.getPackageName();
                    clientContext2.mo17806d("https://www.googleapis.com/auth/peopleapi.legacy.readwrite");
                    clientContext2.mo17806d("https://www.googleapis.com/auth/plus.native");
                    smartProfileChimeraActivity3.f107714b = clientContext2;
                }
                if (!TextUtils.isEmpty(smartProfileChimeraActivity3.f107717e)) {
                    Account account = new Account(smartProfileChimeraActivity3.f107717e, "com.google");
                    ClientContext clientContext3 = smartProfileChimeraActivity3.f107714b;
                    clientContext3.f30213c = account;
                    clientContext3.f30214d = account;
                }
                sfr a2 = sfr.m35174a(smartProfileChimeraActivity3, smartProfileChimeraActivity3.f107714b);
                if (a2.mo25481a("android.permission.READ_SMS") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (a2.mo25481a("android.permission.READ_CALL_LOG") != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (a2.mo25481a("android.permission.READ_CALENDAR") == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (a2.mo25481a("android.permission.READ_CONTACTS") == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                smartProfileChimeraActivity3.f107726n = new aqqu(z, z2, z3, z4);
                String stringExtra2 = intent.getStringExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID");
                if (alwy.m62038a(stringExtra2) && smartProfileChimeraActivity3.f107726n.f86624d) {
                    String b = alwy.m62039b(stringExtra2);
                    if (!TextUtils.isEmpty(b)) {
                        int i4 = Build.VERSION.SDK_INT;
                        ContentResolver contentResolver = smartProfileChimeraActivity3.getContentResolver();
                        Uri uri = ContactsContract.CommonDataKinds.Email.CONTENT_URI;
                        int i5 = Build.VERSION.SDK_INT;
                        Cursor query = contentResolver.query(uri, new String[]{"data1", "is_primary", "times_used"}, "contact_id= ?", new String[]{b}, "times_used DESC");
                        if (query == null) {
                            str = null;
                            str5 = null;
                        } else {
                            str = null;
                            str5 = null;
                            while (query.moveToNext()) {
                                try {
                                    String string = query.getString(0);
                                    if (TextUtils.isEmpty(str)) {
                                        str = string;
                                    }
                                    if (query.getInt(1) == 1) {
                                        str5 = string;
                                    }
                                } finally {
                                    query.close();
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            str = str5;
                        }
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        stringExtra2 = ancm.m64019h(str);
                    } else {
                        if (!TextUtils.isEmpty(b)) {
                            int i6 = Build.VERSION.SDK_INT;
                            ContentResolver contentResolver2 = smartProfileChimeraActivity3.getContentResolver();
                            Uri uri2 = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                            int i7 = Build.VERSION.SDK_INT;
                            Cursor query2 = contentResolver2.query(uri2, new String[]{"data1", "data4", "is_primary", "times_used"}, "contact_id= ?", new String[]{b}, "times_used DESC");
                            if (query2 == null) {
                                str2 = null;
                                str4 = null;
                            } else {
                                str2 = null;
                                str4 = null;
                                while (query2.moveToNext()) {
                                    try {
                                        String string2 = query2.getString(1);
                                        if (TextUtils.isEmpty(string2)) {
                                            string2 = query2.getString(0);
                                        }
                                        if (TextUtils.isEmpty(str2)) {
                                            str2 = string2;
                                        }
                                        if (query2.getInt(1) == 1) {
                                            str4 = string2;
                                        }
                                    } finally {
                                        query2.close();
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(str4)) {
                                str2 = str4;
                            }
                        } else {
                            str2 = null;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            String str6 = smartProfileChimeraActivity3.f107717e;
                            String str7 = smartProfileChimeraActivity3.f107719g;
                            if (!TextUtils.isEmpty(str6) && ssk.m36235a(smartProfileChimeraActivity3) && soz.m35796b(smartProfileChimeraActivity3, new Account(str6, "com.google"), str7)) {
                                Cursor query3 = smartProfileChimeraActivity3.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data1"}, "mimetype=? and contact_id=? and (data1 LIKE \"%plus.google.com%\" or data1 LIKE \"%www.google.com/profile%\")", new String[]{"vnd.android.cursor.item/website", b}, null);
                                if (query3 != null) {
                                    while (query3.moveToNext()) {
                                        try {
                                            String encodedPath = Uri.parse(query3.getString(0)).getEncodedPath();
                                            if (!TextUtils.isEmpty(encodedPath)) {
                                                String[] split = encodedPath.split("/");
                                                str3 = split[split.length - 1];
                                                if (!TextUtils.isEmpty(str3) && str3.matches("[0-9]+")) {
                                                    break;
                                                }
                                            }
                                        } finally {
                                            query3.close();
                                        }
                                    }
                                    query3.close();
                                }
                                str3 = null;
                                if (!TextUtils.isEmpty(str3)) {
                                    stringExtra2 = ancm.m64017f(str3);
                                }
                            }
                        } else {
                            String valueOf = String.valueOf(str2);
                            stringExtra2 = valueOf.length() == 0 ? new String("p:") : "p:".concat(valueOf);
                        }
                    }
                }
                smartProfileChimeraActivity3.f107723k = stringExtra2;
                if (TextUtils.isEmpty(stringExtra2)) {
                    smartProfileChimeraActivity3.setResult(0);
                    smartProfileChimeraActivity3.finish();
                    return;
                }
                if (ancm.m64020i(smartProfileChimeraActivity3.f107723k) && TextUtils.isEmpty(intent.getStringExtra("com.google.android.gms.people.smart_profile.DISPLAY_EMAIL"))) {
                    intent.putExtra("com.google.android.gms.people.smart_profile.DISPLAY_EMAIL", ancm.m64018g(smartProfileChimeraActivity3.f107723k));
                } else if (alwy.m62042e(smartProfileChimeraActivity3.f107723k) && TextUtils.isEmpty(intent.getStringExtra("com.google.android.gms.people.smart_profile.DISPLAY_PHONE"))) {
                    String h = alwy.m62045h(smartProfileChimeraActivity3.f107723k);
                    int i8 = Build.VERSION.SDK_INT;
                    intent.putExtra("com.google.android.gms.people.smart_profile.DISPLAY_PHONE", PhoneNumberUtils.formatNumber(h, Locale.getDefault().getCountry()));
                }
                Toolbar toolbar = (Toolbar) smartProfileChimeraActivity3.findViewById(C0126R.C0129id.toolbar);
                smartProfileChimeraActivity3.f107727o = toolbar;
                smartProfileChimeraActivity3.mo8626a(toolbar);
                smartProfileChimeraActivity3.mo8628aW().mo15858c(false);
                SmartProfileChimeraActivity smartProfileChimeraActivity4 = aqre.f86656o;
                aqre.f86653l = new tim(bundle3, new tik(new qws(smartProfileChimeraActivity4, "CONTACTSHEET", smartProfileChimeraActivity4.f107717e), aqre.f86656o.f107722j));
                if (aqre.f86656o.f107720h.equals(0)) {
                    SmartProfileChimeraActivity smartProfileChimeraActivity5 = aqre.f86656o;
                    smartProfileChimeraActivity5.f107720h = Integer.valueOf(C1133kh.m17843b(smartProfileChimeraActivity5, C0126R.color.default_theme_color));
                }
                if (cgnz.m146325b()) {
                    SmartProfileChimeraActivity smartProfileChimeraActivity6 = aqre.f86656o;
                    smartProfileChimeraActivity6.f107721i = thh.m36964a(smartProfileChimeraActivity6);
                } else {
                    SmartProfileChimeraActivity smartProfileChimeraActivity7 = aqre.f86656o;
                    if (smartProfileChimeraActivity7.f107721i == 0) {
                        smartProfileChimeraActivity7.f107721i = tey.m36884a(smartProfileChimeraActivity7.f107720h.intValue());
                    }
                }
                if (bundle3 != null) {
                    aqre.f86646e.mo59020b(bundle3.getFloat("HEADER_VIEW_COLLAPSE_RATIO"));
                }
                if (!cgnz.m146325b()) {
                    HeaderView headerView = aqre.f86646e;
                    int intValue = aqre.f86656o.f107720h.intValue();
                    headerView.f107761c.setBackgroundColor(intValue);
                    headerView.f107763e.f107757a.setColor(tey.m36884a(intValue));
                }
                aqre.f86647f = new aqvf(aqre.f86646e, aqre.f86653l);
                if (cgoo.f187401a.mo6606a().mo84187b() && aqre.f86656o.f107722j == byug.GOOGLE_VOICE) {
                    aqre.f86647f.f86900a.mo59022d();
                }
                if (!cgnz.m146325b() || !cgnh.m146281c()) {
                    SmartProfileChimeraActivity smartProfileChimeraActivity8 = aqre.f86656o;
                    aqre.f86650i = new aqvk(smartProfileChimeraActivity8, aqre.f86646e, smartProfileChimeraActivity8.f107717e, aqre.f86653l, smartProfileChimeraActivity8.getIntent().getBooleanExtra("com.google.android.gms.people.smart_profile.SHOW_HANGOUTS_ENTRY", true));
                } else {
                    SmartProfileChimeraActivity smartProfileChimeraActivity9 = aqre.f86656o;
                    aqre.f86650i = new aqvk(smartProfileChimeraActivity9, aqre.f86646e, smartProfileChimeraActivity9.f107717e, aqre.f86653l, smartProfileChimeraActivity9.getIntent().getBooleanExtra("com.google.android.gms.people.smart_profile.SHOW_HANGOUTS_ENTRY", true), aqre.f86656o.f107722j != byug.BABEL);
                }
                tie tie = new tie(aqre.f86656o.getSupportLoaderManager(), aqre.f86656o);
                LoaderManager supportLoaderManager = aqre.f86656o.getSupportLoaderManager();
                SmartProfileChimeraActivity smartProfileChimeraActivity10 = aqre.f86656o;
                aqwv aqwv = new aqwv(supportLoaderManager, smartProfileChimeraActivity10.f107714b, smartProfileChimeraActivity10);
                aqre.f86644c = new aqrq(new aqqq(aqre.f86656o), bundle3);
                SmartProfileChimeraActivity smartProfileChimeraActivity11 = aqre.f86656o;
                ClientContext clientContext4 = smartProfileChimeraActivity11.f107714b;
                aqrq aqrq = aqre.f86644c;
                ViewGroup viewGroup = (ViewGroup) smartProfileChimeraActivity11.findViewById(C0126R.C0129id.sp_card_content);
                SmartProfileChimeraActivity smartProfileChimeraActivity12 = aqre.f86656o;
                aqwv aqwv2 = aqwv;
                tie tie2 = tie;
                String str8 = "com.google.android.gms.people.smart_profile.DISPLAY_EMAIL";
                String str9 = "com.google.android.gms.people.smart_profile.DISPLAY_PHONE";
                aqre.f86643b = new aqpw(smartProfileChimeraActivity11, smartProfileChimeraActivity11, clientContext4, aqrq, viewGroup, tie, smartProfileChimeraActivity12.f107717e, smartProfileChimeraActivity12.f107718f, smartProfileChimeraActivity12.f107719g, aqre.f86653l, bundle);
                aqre.f86643b.f86544d.add(aqre);
                Bundle extras2 = aqre.f86656o.getIntent().getExtras();
                if (extras2 != null && extras2.containsKey("com.google.android.gms.people.smart_profile.CARD_BYTES")) {
                    try {
                        bzhm = (bzhm) GeneratedMessageLite.m124016a(bzhm.f170090b, aqre.f86656o.getIntent().getExtras().getByteArray("com.google.android.gms.people.smart_profile.CARD_BYTES"), bxus.m123744c());
                    } catch (bxwf e) {
                        bzhm = null;
                    }
                    if (bzhm != null) {
                        aqpw aqpw = aqre.f86643b;
                        bzhk[] bzhkArr = (bzhk[]) bzhm.f170092a.toArray(new bzhk[0]);
                        if (!aqpw.f86559s.mo48063e()) {
                            ArrayList arrayList = new ArrayList();
                            for (bzhk bzhk : bzhkArr) {
                                if ((bzhk.f170061a & 8) != 0 && arrayList.size() < 10) {
                                    bzia bzia = bzhk.f170065e;
                                    if (bzia == null) {
                                        bzia = bzia.f170139d;
                                    }
                                    arrayList.add(bzia);
                                }
                            }
                            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                if (cgnz.m146325b()) {
                                    View inflate = LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.gm_generic_card_view, aqpw.f86543c, false);
                                    new tft(inflate, (i9 * 50) + 500, aqpw.f86548h, aqpw.f86553m).mo2511a(bmxv.m108566b((bzia) arrayList.get(i9)));
                                    aqpw.f86559s.mo48058a(inflate, tin.m37042a(tio.GENERIC_CARD, i9));
                                } else {
                                    BaseCardView baseCardView = (BaseCardView) LayoutInflater.from(aqpw.f86541a).inflate((int) C0126R.C0128layout.card, aqpw.f86543c, false);
                                    List list = aqpw.f86546f;
                                    Context context = aqpw.f86541a;
                                    bzia bzia2 = (bzia) arrayList.get(i9);
                                    int i10 = (i9 * 50) + 500;
                                    tie tie3 = aqpw.f86548h;
                                    tim tim = aqpw.f86553m;
                                    if (i9 < aqpw.f86554n.size()) {
                                        bundle2 = (Bundle) aqpw.f86554n.get(i9);
                                    } else {
                                        bundle2 = null;
                                    }
                                    list.add(new aqtk(context, baseCardView, bzia2, i10, tie3, tim, bundle2));
                                    aqpw.f86559s.mo48058a(baseCardView, tin.m37042a(tio.GENERIC_CARD, i9));
                                }
                            }
                            if (aqpw.f86559s.mo48063e()) {
                                aqpw.f86559s.mo48061c();
                            }
                        }
                    }
                }
                aqre.f86642a = new aqpy(aqre.f86643b);
                aqre.f86644c.mo48116a(aqre.f86643b);
                aqre.f86644c.mo48116a(aqre.f86650i);
                SmartProfileChimeraActivity smartProfileChimeraActivity13 = aqre.f86656o;
                aqre.f86655n = new aqvs(aqwv2, aqvt.m72175a(smartProfileChimeraActivity13.f107723k, smartProfileChimeraActivity13.getIntent().getExtras()));
                aqvs aqvs = aqre.f86655n;
                aqwv aqwv3 = aqvs.f86932a;
                aqwv3.f87005a.initLoader(4, null, new aqwt(aqwv3, aqvs.mo48198b(), new aqvp(aqvs)));
                aqre.f86655n.mo48197a(aqre.f86642a);
                aqre.f86655n.mo48197a(aqre.f86647f);
                aqre.f86655n.mo48197a(aqre.f86650i);
                aqre.f86655n.mo48197a(aqre.f86644c);
                aquz aquz = new aquz();
                aqwf aqwf = new aqwf(aqre.f86656o.getSupportLoaderManager(), aqre.f86656o);
                SmartProfileChimeraActivity smartProfileChimeraActivity14 = aqre.f86656o;
                aqre.f86651j = new aquw(aqwf, new aquy(smartProfileChimeraActivity14, smartProfileChimeraActivity14.f107723k, smartProfileChimeraActivity14.f107717e, smartProfileChimeraActivity14.f107718f, smartProfileChimeraActivity14.f107722j.f168292ja, smartProfileChimeraActivity14.f107719g), aquz);
                aqre.f86644c.mo48116a(aqre.f86651j);
                aqqt aqqt = new aqqt(aqre.f86656o.getIntent().getStringExtra("com.google.android.gms.people.smart_profile.DISPLAY_NAME"), aqre.f86656o.getIntent().getStringExtra(str9), aqre.f86656o.getIntent().getStringExtra(str8));
                aqre.f86651j.mo48173a(aqqt);
                aqre.f86655n.mo48197a(aqqt);
                aqqt.mo48084a(aqre.f86647f);
                aqqt.mo48084a(aqre.f86650i);
                aqqt.mo48084a(aqre.f86643b);
                aqqt.mo48084a(aquz);
                aqpq aqpq = new aqpq(tie2, new aqvx(aqre.f86656o.getSupportLoaderManager(), aqre.f86656o));
                if (aqre.f86656o.getIntent().hasExtra("com.google.android.gms.people.smart_profile.AVATAR_BYTES")) {
                    byte[] byteArray = aqre.f86656o.getIntent().getExtras().getByteArray("com.google.android.gms.people.smart_profile.AVATAR_BYTES");
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, tey.m36887a());
                    if (!aqpq.f86516a && !aqpq.f86517b) {
                        aqpq.f86516a = true;
                        aqpq.mo48039a(bmxv.m108567c(decodeByteArray));
                    }
                } else if (aqre.f86656o.getIntent().hasExtra("com.google.android.gms.people.smart_profile.AVATAR_URL")) {
                    String stringExtra3 = aqre.f86656o.getIntent().getStringExtra("com.google.android.gms.people.smart_profile.AVATAR_URL");
                    if (!aqpq.f86516a && !aqpq.f86517b && !TextUtils.isEmpty(stringExtra3)) {
                        aqpq.f86516a = true;
                        aqpq.mo48041a(stringExtra3);
                    }
                }
                aqre.f86651j.mo48173a(aqpq);
                aqre.f86655n.mo48197a(aqpq);
                aqpq.mo48037a(aqre.f86647f);
                aqpq.mo48037a(aquz);
                SmartProfileChimeraActivity smartProfileChimeraActivity15 = aqre.f86656o;
                aqre.f86652k = new aqwq(smartProfileChimeraActivity15, smartProfileChimeraActivity15.f107717e, smartProfileChimeraActivity15.f107718f, smartProfileChimeraActivity15.f107722j.f168292ja, smartProfileChimeraActivity15.getSupportLoaderManager());
                aqwq aqwq = aqre.f86652k;
                aqwq.f86995e.initLoader(14, null, new aqwp(aqwq));
                aqre.f86648g = new aqqm();
                aqwq aqwq2 = aqre.f86652k;
                aqqm aqqm = aqre.f86648g;
                aqwq2.f86996f.add(aqqm);
                aqwr aqwr = aqwq2.f86997g;
                if (aqwr != null) {
                    aqqm.mo48078a(aqwr);
                }
                aqre.f86655n.mo48197a(aqre.f86648g);
                aqre.f86648g.mo48077a(aqre.f86643b);
                aqre.f86648g.mo48077a(aqre.f86647f);
                aqre.f86648g.mo48077a(aqre.f86650i);
                if (!cgnz.m146325b()) {
                    aqqj aqqj = new aqqj((FloatingActionButton) aqre.f86656o.findViewById(C0126R.C0129id.fab), aqre.f86651j, aqre.f86653l);
                    aqre.f86655n.mo48197a(aqqj);
                    aqre.f86648g.mo48077a(aqqj);
                }
                LoaderManager supportLoaderManager2 = aqre.f86656o.getSupportLoaderManager();
                SmartProfileChimeraActivity smartProfileChimeraActivity16 = aqre.f86656o;
                aqre.f86654m = new aqwm(supportLoaderManager2, smartProfileChimeraActivity16, smartProfileChimeraActivity16.f107722j.f168292ja, smartProfileChimeraActivity16.f107723k, smartProfileChimeraActivity16.f107717e, smartProfileChimeraActivity16.f107718f);
                aqre.f86654m.mo48200a(9, new aqra(aqre));
                if (!aqre.mo48099c()) {
                    aqre.mo48098b();
                    return;
                }
                return;
            }
            smartProfileChimeraActivity3.setResult(0);
            smartProfileChimeraActivity3.finish();
            return;
        }
        smartProfileChimeraActivity3.setResult(0);
        smartProfileChimeraActivity3.finish();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        aqre aqre = this.f107728p;
        if (cgnz.m146325b()) {
            aqre.f86656o.getMenuInflater().inflate(C0126R.C0130menu.gm_toolbar_menu, menu);
        } else {
            aqre.f86656o.getMenuInflater().inflate(C0126R.C0130menu.profile_main, menu);
        }
        SmartProfileChimeraActivity smartProfileChimeraActivity = aqre.f86656o;
        Toolbar toolbar = smartProfileChimeraActivity.f107727o;
        aquw aquw = aqre.f86651j;
        String concat = String.valueOf(smartProfileChimeraActivity.f107719g).concat(".SMART_PROFILE.USER_INITIATED_FEEDBACK_REPORT");
        SmartProfileChimeraActivity smartProfileChimeraActivity2 = aqre.f86656o;
        aqre.f86649h = new aqvb(smartProfileChimeraActivity, toolbar, aquw, new aqve(smartProfileChimeraActivity, concat, smartProfileChimeraActivity2.f107717e, smartProfileChimeraActivity2.getWindow().getDecorView().getRootView()), aqre.f86653l);
        aqre.f86648g.mo48077a(aqre.f86649h);
        aqre.f86655n.mo48197a(aqre.f86649h);
        return true;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo58991g();
        return true;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        aqre aqre = this.f107728p;
        if (menu != null) {
            aqre.f86653l.mo26568a(tio.OVERFLOW_MENU_BUTTON, tio.SMART_PROFILE_HEADER);
        }
        return super.onMenuOpened(i, menu);
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.f107727o.mo1689d();
        super.onPause();
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
        new adzt().postDelayed(new aqqz(this), 500);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("impressionsLogged", this.f107715c);
        bundle.putBoolean("isError", this.f107716d);
        bundle.putBoolean("firstCardDurationLogged", this.f107724l);
        bundle.putBoolean("allCardsDurationLogged", this.f107725m);
        aqre aqre = this.f107728p;
        aqrq aqrq = aqre.f86644c;
        bundle.putStringArrayList("merged emails", new ArrayList(aqrq.f86664a));
        bundle.putStringArrayList("merged phones", new ArrayList(aqrq.f86665b));
        aqpw aqpw = aqre.f86643b;
        Bundle bundle2 = new Bundle();
        List list = aqpw.f86545e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((aqtc) list.get(i)).mo48130a(bundle2);
        }
        bundle.putBundle("cardsController", bundle2);
        aqpw.f86554n = new ArrayList();
        for (int i2 = 0; i2 < aqpw.f86546f.size(); i2++) {
            aqpw.f86554n.add(new Bundle());
            ((aqtc) aqpw.f86546f.get(i2)).mo48130a((Bundle) aqpw.f86554n.get(i2));
        }
        bundle.putParcelableArrayList("genericCardsController", aqpw.f86554n);
        Set set = aqre.f86653l.f46079a;
        tin[] tinArr = (tin[]) set.toArray(new tin[set.size()]);
        int length = tinArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        for (int i3 = 0; i3 < tinArr.length; i3++) {
            iArr[i3] = tinArr[i3].mo26560a().intValue();
            iArr2[i3] = tinArr[i3].mo26561b() != null ? tinArr[i3].mo26561b().intValue() : -1;
        }
        bundle.putIntArray("veRecordedImpressionNodeIds", iArr);
        bundle.putIntArray("veRecordedImpressionIndexes", iArr2);
        bundle.putFloat("HEADER_VIEW_COLLAPSE_RATIO", aqre.f86646e.f107767i);
    }

    /* renamed from: a */
    private final void m92508a(boolean z) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (z) {
            i = this.f107721i;
        } else {
            i = 0;
        }
        if (cgnz.m146325b()) {
            if (cgmy.f187331a.mo6606a().mo84137h()) {
                int i3 = Build.VERSION.SDK_INT;
            }
            getWindow().setStatusBarColor(i);
            return;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(getWindow(), "statusBarColor", getWindow().getStatusBarColor(), i);
        ofInt.setDuration(150L);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
    }

    /* renamed from: a */
    public final void mo48070a() {
        aqpw aqpw = this.f107728p.f86643b;
        if (aqpw != null) {
            aqpw.f86559s.mo48060b();
            aqpw.f86560t.mo48060b();
            aqpw.f86561u.mo48060b();
            aqpw.f86562v.mo48060b();
            aqpw.f86563w.mo48060b();
        }
    }
}
