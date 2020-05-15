package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.Set;

/* renamed from: aqvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvb extends aqva implements aquv, aqql, aqvr {

    /* renamed from: d */
    static final Intent f86883d = new Intent("android.intent.action.VIEW", Uri.parse(cgor.m146363b()));

    /* renamed from: e */
    private final Activity f86884e;

    /* renamed from: f */
    private final aqve f86885f;

    /* renamed from: g */
    private final aquw f86886g;

    /* renamed from: h */
    private final Toast f86887h = Toast.makeText(this.f86881b, (int) C0126R.string.added_to_favorites, 0);

    /* renamed from: i */
    private final tim f86888i;

    /* renamed from: j */
    private int f86889j;

    /* renamed from: k */
    private int f86890k;

    /* renamed from: l */
    private boolean f86891l;

    /* renamed from: m */
    private boolean f86892m;

    /* renamed from: n */
    private boolean f86893n;

    public aqvb(Activity activity, Toolbar toolbar, aquw aquw, aqve aqve, tim tim) {
        super(activity, toolbar);
        this.f86884e = activity;
        this.f86885f = aqve;
        this.f86886g = aquw;
        this.f86888i = tim;
        if (cgnz.m146325b()) {
            this.f86889j = 0;
            aquw.mo48174a(this);
            return;
        }
        aquw.mo48174a(this);
        this.f86880a.findItem(C0126R.C0129id.menu_star_contact).setShowAsAction(1);
        this.f86889j = 0;
    }

    /* renamed from: l */
    private final void m72143l() {
        boolean z;
        int i;
        int i2;
        if (cgnz.m146325b()) {
            int i3 = this.f86889j;
            if (i3 != 0) {
                if (!this.f86893n || this.f86892m || i3 != 1) {
                    mo48186k();
                } else {
                    mo48185j();
                }
                if (!this.f86893n || this.f86892m || this.f86891l || this.f86889j != 2) {
                    mo48184i();
                } else {
                    mo48183h();
                }
            }
        } else if (!this.f86891l && !this.f86892m) {
            int i4 = this.f86889j;
            if (i4 == 1) {
                int i5 = this.f86890k;
                if (i5 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.f86882c = z;
                if (i5 == 3) {
                    i = C0126R.string.unstar_contact_content_description;
                } else {
                    i = C0126R.string.star_contact_content_description;
                }
                if (i5 == 3) {
                    i2 = C0126R.C0127drawable.quantum_ic_star_vd_theme_24;
                } else {
                    i2 = C0126R.C0127drawable.quantum_ic_star_border_vd_theme_24;
                }
                MenuItem findItem = this.f86880a.findItem(C0126R.C0129id.menu_star_contact);
                findItem.setIcon(i2);
                C1264pc.m19827a(findItem, this.f86881b.getString(i));
                findItem.setVisible(true);
                mo48184i();
                mo48185j();
            } else if (i4 == 2) {
                mo48182g();
                mo48183h();
                mo48186k();
            }
        } else {
            mo48182g();
            mo48184i();
            if (this.f86892m || this.f86889j != 1) {
                mo48186k();
            } else {
                mo48185j();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48176a() {
        this.f86886g.mo48175a(true);
        this.f86887h.setText((int) C0126R.string.added_to_favorites);
        this.f86887h.show();
        this.f86888i.mo26568a(tio.STAR_BUTTON, tio.SMART_PROFILE_HEADER);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo48177b() {
        this.f86886g.mo48175a(false);
        this.f86887h.setText((int) C0126R.string.removed_from_favorites);
        this.f86887h.show();
        this.f86888i.mo26568a(tio.UNSTAR_BUTTON, tio.SMART_PROFILE_HEADER);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo48178c() {
        this.f86886g.mo48171a();
        this.f86888i.mo26568a(tio.ADD_TO_CONTACTS_BUTTON, tio.OVERFLOW_MENU, tio.SMART_PROFILE_HEADER);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo48179d() {
        aquw aquw = this.f86886g;
        Set a = aquw.m72121a(aquw.f86859b);
        if (a.size() == 1) {
            aquy aquy = aquw.f86861d;
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.setDataAndType(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, (String) a.iterator().next()), "vnd.android.cursor.item/contact");
            int i = Build.VERSION.SDK_INT;
            intent.putExtra("finishActivityOnSaveCompleted", true);
            aquy.f86872a.startActivityForResult(intent, 2);
        } else if (a.size() > 1) {
            aquy aquy2 = aquw.f86861d;
            Intent className = new Intent().setClassName(rpr.m34216b(), "com.google.android.gms.smart_profile.ContactsPickerActivity");
            className.putExtra("com.google.android.gms.people.smart_profile.QUALIFIED_ID", aquy2.f86873b);
            className.putExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME", aquy2.f86874c);
            className.putExtra("com.google.android.gms.people.smart_profile.VIEWER_PAGE_ID", aquy2.f86875d);
            className.putExtra("com.google.android.gms.people.smart_profile.APPLICATION_ID", aquy2.f86876e);
            className.putExtra("com.google.android.gms.people.smart_profile.CALLING_PACKAGE", aquy2.f86877f);
            aquy2.f86872a.startActivity(className);
        }
        this.f86888i.mo26568a(tio.EDIT_CONTACT_BUTTON, tio.OVERFLOW_MENU, tio.SMART_PROFILE_HEADER);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo48180e() {
        this.f86884e.startActivity(f86883d);
        this.f86888i.mo26568a(tio.EDIT_PROFILE_BUTTON, tio.OVERFLOW_MENU, tio.SMART_PROFILE_HEADER);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo48181f() {
        Bitmap bitmap;
        aqve aqve = this.f86885f;
        wwr wwr = aqve.f86896a;
        wwu wwu = new wwu();
        wwu.f51499d = aqve.f86897b;
        wwu.f51496a = aqve.f86898c;
        try {
            aqve.f86899d.setDrawingCacheEnabled(true);
            bitmap = aqve.f86899d.getDrawingCache();
        } catch (Exception e) {
            bitmap = null;
        }
        wwu.mo29491a(bitmap);
        wwr.mo29487a(wwu.mo29490a());
        this.f86888i.mo26568a(tio.SEND_FEEDBACK_BUTTON, tio.OVERFLOW_MENU, tio.SMART_PROFILE_HEADER);
    }

    /* renamed from: a */
    public final void mo48076a(int i, int i2) {
        this.f86889j = i;
        this.f86890k = i2;
        m72143l();
    }

    /* renamed from: a */
    public final void mo48038a(aqqw aqqw) {
        boolean z = false;
        if (aqqw.mo48087c() && aqqw.f86628d.f170193e) {
            z = true;
        }
        this.f86891l = z;
        m72143l();
    }

    /* renamed from: a */
    public final void mo48049a(boolean z) {
        this.f86892m = z;
        this.f86893n = true;
        m72143l();
        if (cgmy.f187331a.mo6606a().mo84133d()) {
            String stringExtra = this.f86884e.getIntent().getStringExtra("com.google.android.gms.people.smart_profile.VIEWER_ACCOUNT_NAME");
            Uri.Builder appendQueryParameter = Uri.parse("https://accounts.google.com/accountchooser").buildUpon().appendQueryParameter("continue", cgor.m146363b());
            if (!TextUtils.isEmpty(stringExtra)) {
                appendQueryParameter.appendQueryParameter("Email", stringExtra).build();
            }
            f86883d.setData(appendQueryParameter.build());
        }
        if (z && f86883d.resolveActivity(this.f86884e.getPackageManager()) != null) {
            this.f86880a.findItem(C0126R.C0129id.edit_profile).setVisible(true);
        }
    }
}
