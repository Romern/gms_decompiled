package com.google.android.gms.locationsharing.updateshares.people;

import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import com.felicanetworks.mfc.BuildConfig;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.SelectionFragmentOptions;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationSharingSelectionChimeraActivity extends deu implements fwz, fxb, aesu {

    /* renamed from: b */
    public aetk f79777b;

    /* renamed from: c */
    public View f79778c;

    /* renamed from: d */
    public fxc f79779d;

    /* renamed from: e */
    public String f79780e;

    /* renamed from: f */
    public int f79781f;

    /* renamed from: g */
    public ViewGroup f79782g;

    /* renamed from: h */
    public ContactPerson f79783h;

    /* renamed from: i */
    private Button f79784i;

    /* renamed from: j */
    private boolean f79785j;

    /* renamed from: k */
    private ViewTreeObserver.OnGlobalLayoutListener f79786k = new aexc(this);

    /* renamed from: l */
    private LoaderManager.LoaderCallbacks f79787l;

    /* renamed from: a */
    public static final void m67108a(ContactPerson contactPerson) {
        ContactPerson.ContactMethod a = contactPerson.mo7263a();
        contactPerson.f9753e.clear();
        contactPerson.mo7265a(bnkn.m109665a(a));
        contactPerson.mo7264a(a);
    }

    /* renamed from: h */
    private final void m67110h() {
        aexw.m52665a(this, C0126R.string.location_sharing_resolve_contact_loading, true, new aexf(this));
    }

    /* renamed from: aX */
    public final boolean mo8629aX() {
        finish();
        return true;
    }

    /* renamed from: b */
    public final void mo7252b(int i, int i2) {
        aexw.m52662a(this);
        fxc fxc = this.f79779d;
        if (fxc != null && !fxc.mo11451a().isEmpty()) {
            mo43830g();
        }
    }

    /* renamed from: c */
    public final void mo34527c(String str) {
    }

    /* renamed from: e */
    public final void mo7255e() {
    }

    /* renamed from: g */
    public final void mo43830g() {
        boolean z;
        int i;
        fxc fxc = this.f79779d;
        if (fxc == null || fxc.mo11451a().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        View view = this.f79778c;
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (z) {
            View findViewById = findViewById(C0126R.C0129id.sms_warning);
            for (ContactPerson contactPerson : this.f79779d.mo11451a()) {
                if (contactPerson.mo7263a().f9755a == 2) {
                    findViewById.setVisibility(0);
                    findViewById.findViewById(C0126R.C0129id.sms_icon).setVisibility(8);
                    return;
                }
            }
            findViewById.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        String str;
        Fragment fragment;
        ContactPerson.ContactMethod contactMethod;
        String str2;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.location_sharing_selection_activity);
        int intExtra = getIntent().getIntExtra("status_bar_color", -2);
        if (intExtra != -2) {
            int i = Build.VERSION.SDK_INT;
            getWindow().setStatusBarColor(intExtra);
        }
        this.f79787l = new aexe(this);
        int i2 = 1;
        if (!this.f79785j) {
            ViewGroup viewGroup = (ViewGroup) findViewById(C0126R.C0129id.root_layout);
            this.f79782g = viewGroup;
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this.f79786k);
            this.f79785j = true;
        }
        String stringExtra = getIntent().getStringExtra("account_name");
        this.f79780e = stringExtra;
        if (stringExtra == null) {
            finish();
            return;
        }
        String stringExtra2 = getIntent().getStringExtra("session_id");
        if (stringExtra2 == null) {
            stringExtra2 = aetk.m52537a();
        }
        this.f79777b = new aetk(this, null, null, stringExtra2);
        if (bundle2 != null) {
            this.f79783h = (ContactPerson) bundle2.getParcelable("arg_contact_person");
        }
        setTitle(getString(C0126R.string.location_sharing_general_selection_title));
        C1341rz aW = mo8628aW();
        aW.mo15845a(getString(C0126R.string.location_sharing_general_selection_title));
        aW.mo15858c(true);
        aW.mo15853b(true);
        int intExtra2 = getIntent().getIntExtra("action_bar_color", -2);
        if (intExtra2 != -2) {
            aW.mo15851b(new ColorDrawable(intExtra2));
        }
        this.f79778c = findViewById(C0126R.C0129id.bottom_share_container);
        Button button = (Button) findViewById(C0126R.C0129id.select);
        this.f79784i = button;
        button.setOnClickListener(new aexd(this));
        int intExtra3 = getIntent().getIntExtra("accent_color", -2);
        this.f79781f = intExtra3;
        int i3 = 0;
        if (intExtra3 != -2) {
            this.f79784i.setTextColor(intExtra3);
        } else {
            try {
                TypedArray obtainStyledAttributes = obtainStyledAttributes(new TypedValue().data, new int[]{C0126R.attr.colorAccent});
                this.f79781f = obtainStyledAttributes.getColor(0, -2);
                obtainStyledAttributes.recycle();
            } catch (Exception e) {
            }
        }
        mo43830g();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("selection_fragment");
        if (findFragmentByTag != null) {
            this.f79779d = new fxc(this, findFragmentByTag);
        } else {
            ArrayList b = sef.m35076b(getIntent(), "extra_initial_audience_members", AudienceMember.CREATOR);
            String[] split = cfaz.f183554a.mo6606a().mo80796s().split(";");
            if (!getPackageManager().hasSystemFeature("android.hardware.telephony")) {
                ArrayList arrayList2 = new ArrayList(Arrays.asList(split));
                arrayList2.remove("phone");
                if (arrayList2.size() != split.length) {
                    split = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                }
            }
            String str3 = this.f79780e;
            if (b != null) {
                ArrayList arrayList3 = new ArrayList(b.size());
                int size = b.size();
                int i4 = 0;
                while (i4 < size) {
                    AudienceMember audienceMember = (AudienceMember) b.get(i4);
                    if (aexk.m52647b(audienceMember)) {
                        String a = aexk.m52645a(audienceMember);
                        contactMethod = new ContactPerson.ContactMethod(i3, aexk.m52645a(audienceMember));
                        str2 = a;
                    } else if (aexk.m52649d(audienceMember)) {
                        contactMethod = new ContactPerson.ContactMethod(i2, aexk.m52645a(audienceMember));
                        str2 = null;
                    } else if (aexk.m52648c(audienceMember)) {
                        contactMethod = new ContactPerson.ContactMethod(2, aexk.m52645a(audienceMember));
                        str2 = null;
                    } else {
                        throw new IllegalArgumentException("Can't convert given AudienceMember to ContactPerson.");
                    }
                    arrayList3.add(new ContactPerson(audienceMember.f30296f, str2, new AvatarReference(5, audienceMember.f30297g), bnkn.m109665a(contactMethod)));
                    i4++;
                    b = b;
                    size = size;
                    i3 = 0;
                    i2 = 1;
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            SelectionFragmentOptions selectionFragmentOptions = new SelectionFragmentOptions(str3, Integer.MAX_VALUE, arrayList, false, split, 3, 5, getPackageName(), null, false, new ArrayList(), false, false, new Bundle());
            if (!selectionFragmentOptions.f9785n.containsKey("methodIcons")) {
                selectionFragmentOptions.f9785n.putBundle("methodIcons", new Bundle());
            }
            selectionFragmentOptions.f9785n.getBundle("methodIcons").putInt(Integer.toString(0), 0);
            if (!selectionFragmentOptions.f9785n.containsKey("croppedMethodIcons")) {
                selectionFragmentOptions.f9785n.putBundle("croppedMethodIcons", new Bundle());
            }
            selectionFragmentOptions.f9785n.getBundle("croppedMethodIcons").putInt(Integer.toString(0), 0);
            List asList = Arrays.asList(split);
            boolean contains = asList.contains("email");
            boolean contains2 = asList.contains("phone");
            boolean contains3 = asList.contains(BuildConfig.FLAVOR_client);
            if (contains && contains2 && contains3) {
                str = getString(C0126R.string.location_sharing_appinvite_recipients_hint_all);
            } else if (contains3 && contains) {
                str = getString(C0126R.string.location_sharing_appinvite_recipients_hint_partial, new Object[]{getString(C0126R.string.location_sharing_appinvite_recipients_hint_email)});
            } else if (contains3 && contains2) {
                str = getString(C0126R.string.location_sharing_appinvite_recipients_hint_partial, new Object[]{getString(C0126R.string.location_sharing_appinvite_recipients_hint_phone)});
            } else if (contains && contains2) {
                str = getString(C0126R.string.location_sharing_recipients_hint_email_phone);
            } else if (contains3) {
                str = getString(C0126R.string.location_sharing_appinvite_recipients_hint_names);
            } else if (contains) {
                str = getString(C0126R.string.location_sharing_recipients_hint_email);
            } else {
                str = contains2 ? getString(C0126R.string.location_sharing_recipients_hint_phone) : "";
            }
            Bundle bundle3 = new Bundle();
            bundle3.putString("type", "selection");
            bundle3.putCharSequence("hintText", str);
            bundle3.putBoolean("docked", true);
            bundle3.putBoolean("showCount", false);
            selectionFragmentOptions.f9782k.add(bundle3);
            if (cfaz.f183554a.mo6606a().mo80787j()) {
                String string = getString(C0126R.string.location_sharing_header_suggestions);
                Bundle bundle4 = new Bundle();
                bundle4.putString("type", "grid");
                SelectionFragmentOptions.m6217a(bundle4, "suggested", split, null, string);
                selectionFragmentOptions.f9782k.add(bundle4);
            }
            String string2 = getString(C0126R.string.common_people_settings_title);
            Bundle bundle5 = new Bundle();
            bundle5.putString("type", "list");
            SelectionFragmentOptions.m6217a(bundle5, "identityPeople", split, "useCachedContacts", string2);
            selectionFragmentOptions.f9782k.add(bundle5);
            fxc fxc = new fxc(this, selectionFragmentOptions);
            this.f79779d = fxc;
            try {
                fragment = (Fragment) vzs.m41641a(fxc.f17494a.mo7279a());
            } catch (RemoteException e2) {
                bqye.m113758a(e2);
                fragment = null;
            }
            beginTransaction.add(C0126R.C0129id.selection_fragment_container, fragment, "selection_fragment");
        }
        try {
            this.f79779d.f17494a.mo7283a(new fwq(this));
        } catch (RemoteException e3) {
            bqye.m113758a(e3);
        }
        int i5 = this.f79781f;
        if (i5 != -2) {
            try {
                this.f79779d.f17494a.mo7280a(i5);
            } catch (RemoteException e4) {
                bqye.m113758a(e4);
            }
            try {
                this.f79779d.f17494a.mo7287b(this.f79781f);
            } catch (RemoteException e5) {
                bqye.m113758a(e5);
            }
        }
        try {
            this.f79779d.f17494a.mo7286a(true);
        } catch (RemoteException e6) {
            bqye.m113758a(e6);
        }
        try {
            this.f79779d.f17494a.mo7284a(new fwt(this));
        } catch (RemoteException e7) {
            bqye.m113758a(e7);
        }
        if (!beginTransaction.isEmpty()) {
            aexw.m52664a(this, C0126R.string.location_sharing_loading_contacts, true);
            beginTransaction.commit();
        }
        if (this.f79783h != null) {
            m67110h();
            getSupportLoaderManager().initLoader(0, null, this.f79787l);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        if (this.f79785j) {
            this.f79782g.getViewTreeObserver().removeGlobalOnLayoutListener(this.f79786k);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("arg_contact_person", this.f79783h);
    }

    public final void onStop() {
        super.onStop();
        aexw.m52662a(this);
    }

    /* renamed from: b */
    public final void mo34526b(String str) {
        this.f79779d.mo11452a(this.f79783h);
        this.f79783h = null;
    }

    /* renamed from: a */
    public final void mo7245a(int i, int i2) {
        aexw.m52662a(this);
        fxc fxc = this.f79779d;
        if (fxc != null && !fxc.mo11451a().isEmpty()) {
            mo43830g();
        }
    }

    /* renamed from: a */
    public final void mo7248a(ContactPerson contactPerson, boolean z) {
        int i;
        aetk aetk = this.f79777b;
        if (!z) {
            i = 3;
        } else {
            i = 2;
        }
        aetk.mo34549a(i, this.f79779d.mo11451a().size());
        mo43830g();
        if (!z) {
            return;
        }
        if (contactPerson.mo7263a().f9755a != 0) {
            this.f79783h = contactPerson;
            m67110h();
            getSupportLoaderManager().restartLoader(0, null, this.f79787l);
            return;
        }
        m67108a(contactPerson);
    }

    /* renamed from: a */
    public final void mo34525a(String str) {
        this.f79779d.mo11452a(this.f79783h);
        this.f79783h = null;
    }
}
