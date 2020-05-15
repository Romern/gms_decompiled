package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.List;

/* renamed from: annl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class annl extends anmf implements AdapterView.OnItemClickListener {
    /* renamed from: i */
    private final void m64813i() {
        ((TextView) getActivity().findViewById(C0126R.C0129id.empty_text)).setText("");
        getActivity().findViewById(C0126R.C0129id.empty_view).setVisibility(8);
    }

    /* renamed from: a */
    public abstract annk mo41951a(Context context);

    /* renamed from: d */
    public abstract CharSequence mo41953d();

    /* renamed from: e */
    public abstract CharSequence mo41954e();

    /* renamed from: f */
    public abstract Intent mo41955f();

    /* renamed from: g */
    public final annk getListAdapter() {
        return (annk) super.getListAdapter();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final annk mo41994h() {
        annk g = getListAdapter();
        if (g != null) {
            return g;
        }
        annk a = mo41951a(getActivity());
        setListAdapter(a);
        return a;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo41942b();
        getListView().setOnItemClickListener(this);
        TextView textView = (TextView) getActivity().findViewById(C0126R.C0129id.empty_text);
        textView.setAutoLinkMask(15);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            ((anmf) this).f77123a.mo41935a(intent.getStringExtra("deviceAddress"));
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str;
        Object item = getListAdapter().getItem(i);
        if (item instanceof anxl) {
            anxl anxl = (anxl) item;
            ApplicationInfo d = anxl.mo42354d();
            if (d != null) {
                str = d.packageName;
            } else {
                str = null;
            }
            Account account = ((anmf) this).f77123a.f77107a;
            String c = anxl.mo42353c();
            String a = anxl.mo42351a();
            String b = anxl.mo42352b();
            boolean f = anxl.mo42355f();
            String h = anxl.mo42357h();
            String i2 = anxl.mo42358i();
            String j2 = anxl.mo42359j();
            boolean k = anxl.mo42360k();
            boolean g = anxl.mo42356g();
            Intent intent = new Intent("com.google.android.gms.plus.action.MANAGE_APP");
            intent.putExtra("com.google.android.gms.plus.ACCOUNT", account);
            intent.putExtra("com.google.android.gms.plus.APP_ID", c);
            intent.putExtra("com.google.android.gms.plus.APP_PACKAGE", str);
            intent.putExtra("com.google.android.gms.plus.APP_NAME", a);
            intent.putExtra("com.google.android.gms.plus.APP_ICON_URL", b);
            intent.putExtra("com.google.android.gms.plus.APP_IS_ASPEN", f);
            intent.putExtra("com.google.android.gms.plus.APP_SCOPES", h);
            intent.putExtra("com.google.android.gms.plus.APP_REVOKE_HANDLE", i2);
            intent.putExtra("com.google.android.gms.plus.APP_REVOKE_MESSAGE", j2);
            intent.putExtra("com.google.android.gms.plus.APP_HAS_CONN_READ", k);
            intent.putExtra("com.google.android.gms.plus.APP_IS_FITNESS", g);
            getActivity().startActivityForResult(intent, 1);
            ((anmf) this).f77123a.mo41934a(mo41944c(), anxl.mo42355f() ? rih.f43051e : rih.f43052f);
        } else if (item instanceof BleDevice) {
            Intent intent2 = new Intent();
            intent2.setClassName(getActivity(), "com.google.android.gms.plus.apps.ManageDeviceActivity");
            intent2.putExtra("device", (BleDevice) item);
            startActivityForResult(intent2, 1);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 100) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent f = mo41955f();
        if (!spn.m35860a(getActivity(), f)) {
            rid.m33629a(getActivity(), f, 0);
            return true;
        }
        startActivity(f);
        return true;
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        menu.add(0, 100, 100, (int) C0126R.string.common_list_apps_menu_help);
    }

    /* renamed from: a */
    private final void m64812a(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        ((TextView) getActivity().findViewById(C0126R.C0129id.empty_text)).setText(charSequence);
        getActivity().findViewById(C0126R.C0129id.empty_view).setVisibility(0);
    }

    /* renamed from: a */
    public final void mo41930a() {
        if (getActivity() != null) {
            annk h = mo41994h();
            int i = ((anmf) this).f77123a.f77109c;
            if (i == 0) {
                setListShown(true);
                h.mo41984a(((anmf) this).f77123a.f77110d, false);
                List list = ((anmf) this).f77123a.f77112f;
                h.f77198a.clear();
                if (list != null) {
                    h.f77198a.addAll(list);
                }
                h.notifyDataSetChanged();
                if (h.getCount() == 0) {
                    m64812a(mo41953d());
                } else {
                    m64813i();
                }
            } else if (i == 2) {
                setListShown(true);
                m64812a(getString(C0126R.string.plus_list_apps_no_accounts));
                h.mo41985b();
            } else if (i != 3) {
                m64813i();
                setListShown(true);
                if (!((anmf) this).f77123a.f77110d.isEmpty()) {
                    h.mo41984a(((anmf) this).f77123a.f77110d, true);
                }
            } else {
                setListShown(true);
                m64812a(mo41954e());
                h.mo41985b();
            }
        }
    }
}
