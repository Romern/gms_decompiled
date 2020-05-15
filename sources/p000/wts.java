package p000;

import android.accounts.Account;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.DialogInterface;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.Toolbar;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: wts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wts extends Fragment {

    /* renamed from: a */
    public apr f51314a;

    /* renamed from: b */
    public byte[] f51315b;

    /* renamed from: c */
    public String f51316c;

    /* renamed from: d */
    public MenuItem f51317d;

    /* renamed from: e */
    public View f51318e;

    /* renamed from: f */
    public TextView f51319f;

    /* renamed from: g */
    public TextView f51320g;

    /* renamed from: h */
    public wrz f51321h;

    /* renamed from: i */
    public burc f51322i;

    /* renamed from: j */
    public wsm f51323j;

    /* renamed from: k */
    final burb f51324k = new wtq(this);

    /* renamed from: l */
    private final ContentObserver f51325l = new wtp(this, "nearby", "FastPairDeviceDetailsFragment", new adzt());

    /* renamed from: a */
    private static final String m42238a(HeadsetPiece headsetPiece) {
        int b = headsetPiece.mo60341b();
        return !TrueWirelessHeadset.m94499a(b) ? "‒" : Integer.toString(b);
    }

    /* renamed from: g */
    public static final Executor m42240g() {
        return snp.m35704b(10);
    }

    /* renamed from: h */
    private final BluetoothDevice m42241h() {
        String str;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || (str = this.f51316c) == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
            bnsl.mo68432a("wts", "h", 354, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DeviceDetail: getRemoteBluetoothDevice with null variable, return null.");
            return null;
        }
        try {
            return defaultAdapter.getRemoteDevice(str);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo29399b() {
        String str;
        if (this.f51318e != null && mo29402e()) {
            TextView textView = (TextView) this.f51318e.findViewById(C0126R.C0129id.description);
            try {
                TrueWirelessHeadset b = this.f51322i.mo73024b(this.f51316c);
                if (b != null) {
                    textView.setVisibility(0);
                    if (TrueWirelessHeadset.m94499a(b.mo60349d().mo60341b())) {
                        str = getString(C0126R.string.fast_pair_device_details_battery_level, m42238a(b.mo60347b()), m42238a(b.mo60349d()), m42238a(b.mo60348c()));
                    } else {
                        str = getString(C0126R.string.fast_pair_device_details_battery_level_no_case, m42238a(b.mo60347b()), m42238a(b.mo60348c()));
                    }
                    textView.setText(str);
                    textView.setContentDescription(busl.m120387a(b, new wti(this, b), new wtj(this, b), new wtk(this, b)));
                    return;
                }
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("wts", "b", 253, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("DeviceDetail: RemoteException when try to getBatteryAdvertisement.");
            }
            int a = buqx.m120256a(this.f51316c);
            if (TrueWirelessHeadset.m94499a(a)) {
                textView.setVisibility(0);
                textView.setText(getString(C0126R.string.common_battery_level, Integer.valueOf(a)));
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo29400c() {
        wrz wrz = this.f51321h;
        if (wrz != null) {
            wrz.f51224e.clear();
            try {
                wrz.f51222a.mo2273a(wrz.f51223d);
                wrz.f51224e.addAll(wup.m42310a(wrz.f51222a.mo2277c(wrz.f51223d)));
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("wrz", "c", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("DeviceDetailsSliceItemAdapter.updateSliceItem meet exception, optional module might not be installed.");
            }
            bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
            bnsl2.mo68432a("wrz", "c", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68409a("updateSliceItem called, Get slice items %d", wrz.f51224e.size());
            wrz.mo171aJ();
            return;
        }
        bnsl bnsl3 = (bnsl) wtw.f51331a.mo68388c();
        bnsl3.mo68432a("wts", "c", 282, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68405a("DeviceDetail: deviceDetailsSliceItemAdapter is null when updateDetails.");
    }

    /* renamed from: e */
    public final boolean mo29402e() {
        return !TextUtils.isEmpty(this.f51316c);
    }

    /* renamed from: f */
    public final String mo29403f() {
        TextView textView = this.f51319f;
        if (textView != null) {
            return textView.getText().toString();
        }
        return null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f51315b = getArguments().getByteArray("account_key");
        this.f51314a = apr.m1818a(getContext());
        wtv.m42254a(getContext(), bvin.FAST_PAIR_ACCOUNT_SETTINGS_DEVICE_ITEM_LAUNCHED);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C0126R.C0130menu.device_details_menu, menu);
        menuInflater.inflate(C0126R.C0130menu.devices_menu, menu);
        MenuItem findItem = menu.findItem(C0126R.C0129id.action_rename);
        this.f51317d = findItem;
        findItem.setVisible(false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fast_pair_fragment_device_details, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(C0126R.C0129id.toolbar);
        deu deu = (deu) getActivity();
        deu.mo8626a(toolbar);
        toolbar.mo1678a(new wte(this));
        C1341rz aW = deu.mo8628aW();
        aW.mo15855c((int) C0126R.string.fast_pair_device_details_title);
        aW.mo15853b(true);
        aW.mo15846a(true);
        setHasOptionsMenu(true);
        this.f51318e = inflate.findViewById(C0126R.C0129id.header);
        this.f51319f = (TextView) inflate.findViewById(C0126R.C0129id.title);
        this.f51320g = (TextView) inflate.findViewById(C0126R.C0129id.text_address);
        if (this.f51323j == null) {
            this.f51323j = new wsm(getActivity());
        }
        m42240g().execute(new wth(this));
        inflate.findViewById(C0126R.C0129id.forgetButton).setOnClickListener(new wtg(this));
        this.f51322i = new burc(getContext(), this.f51324k);
        return inflate;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C0126R.C0129id.action_help) {
            wsd.m42208a(getActivity());
            return true;
        } else if (menuItem.getItemId() != C0126R.C0129id.action_rename) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            View inflate = getLayoutInflater(null).inflate((int) C0126R.C0128layout.dialog_edittext, (ViewGroup) null);
            EditText editText = (EditText) inflate.findViewById(C0126R.C0129id.edittext);
            editText.setFilters(new InputFilter[]{new butm(248)});
            editText.setText(mo29403f());
            C1349sg sgVar = new C1349sg(getContext());
            sgVar.mo15905b((int) C0126R.string.common_device_name);
            sgVar.mo15907b(inflate);
            sgVar.mo15906b((int) C0126R.string.rename_bluetooth_device, new wtn(this, editText));
            sgVar.mo15892a(17039360, (DialogInterface.OnClickListener) null);
            C1350sh b = sgVar.mo15904b();
            b.setOnShowListener(new wto(this, b, editText));
            b.show();
            return true;
        }
    }

    public final void onPause() {
        burc burc = this.f51322i;
        if (burc != null) {
            burc.mo73025b();
        }
        wrz wrz = this.f51321h;
        if (wrz != null) {
            try {
                wrz.f51222a.mo2275b(wrz.f51223d);
            } catch (IllegalStateException | NullPointerException e) {
                bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("wrz", "d", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("DeviceDetailsSliceItemAdapter.unpinSlice meet exception!");
            }
        }
        getContext().getContentResolver().unregisterContentObserver(this.f51325l);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        ((wse) getActivity()).mo29348a((int) C0126R.string.fast_pair_device_details_title);
        burc burc = this.f51322i;
        if (burc != null) {
            burc.mo73022a();
        }
        getContext().getContentResolver().registerContentObserver(aypl.f98193a, true, this.f51325l);
        getContext().getContentResolver().registerContentObserver(busp.f154817a, true, this.f51325l);
    }

    public void renameDevice(String str) {
        buqx.m120259a(this.f51316c, str);
        TextView textView = this.f51319f;
        if (textView != null) {
            textView.setText(str);
        }
        wtv.m42254a(getContext(), bvin.FAST_PAIR_DEVICE_RENAMED);
    }

    /* renamed from: a */
    public static wts m42239a(byte[] bArr) {
        wts wts = new wts();
        Bundle bundle = new Bundle();
        bundle.putByteArray("account_key", bArr);
        wts.setArguments(bundle);
        return wts;
    }

    /* renamed from: d */
    public final void mo29401d() {
        String str;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothDevice bluetoothDevice = null;
        if (defaultAdapter == null || (str = this.f51316c) == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
            bnsl.mo68432a("wts", "h", 354, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DeviceDetail: getRemoteBluetoothDevice with null variable, return null.");
        } else {
            try {
                bluetoothDevice = defaultAdapter.getRemoteDevice(str);
            } catch (IllegalArgumentException e) {
            }
        }
        if (mo29402e() && bluetoothDevice != null) {
            bnsl bnsl2 = (bnsl) wtw.f51331a.mo68390d();
            bnsl2.mo68432a("wts", "d", 329, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("DeviceDetail: Forget device %s by BluetoothDevice.removeBond", this.f51316c);
            m42240g().execute(new wtm(this, bluetoothDevice));
            return;
        }
        bnsl bnsl3 = (bnsl) wtw.f51331a.mo68390d();
        bnsl3.mo68432a("wts", "d", 343, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68420a("DeviceDetail: Forget device %s (should be null) by FootprintsDeviceManager.forgetDevice", this.f51316c);
        buru buru = this.f51323j.f51252a;
        byte[] bArr = this.f51315b;
        List a = buru.m120318a(buru.f154791b);
        int size = a.size();
        int i = 0;
        while (i < size) {
            Account account = (Account) a.get(i);
            try {
                ahza a2 = buru.m120317a((List) buru.mo73055a(account).get(), bArr);
                if (a2 == null) {
                    i++;
                } else if ((a2.f68443a & 4) == 0) {
                    bnsl bnsl4 = (bnsl) busr.f154819a.mo68388c();
                    bnsl4.mo68432a("buru", "a", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("FastPair: fail to forget footprints because device has no sha256.");
                    return;
                } else {
                    buru.mo73060a(account, bArr, a2.f68446d.mo73780k());
                    return;
                }
            } catch (InterruptedException | ExecutionException e2) {
                bnsl bnsl5 = (bnsl) busr.f154819a.mo68388c();
                bnsl5.mo68437a(e2);
                bnsl5.mo68432a("buru", "a", 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("FastPair: fail to forget footprints.");
            }
        }
    }

    /* renamed from: a */
    public final void mo29395a() {
        int i;
        String str;
        burc burc;
        if (!mo29402e() && (burc = this.f51322i) != null) {
            try {
                this.f51316c = burc.mo73021a(this.f51315b);
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("wts", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("DeviceDetail: Get address from account key fail.");
            }
        }
        if (this.f51321h == null && getView() != null) {
            RecyclerView recyclerView = (RecyclerView) getView().findViewById(C0126R.C0129id.sliceDetailsLink);
            getContext();
            recyclerView.setLayoutManager(new aah());
            Context context = getContext();
            apr apr = this.f51314a;
            Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath("links");
            if (mo29402e()) {
                appendPath.appendQueryParameter("address", this.f51316c);
            } else if (this.f51315b != null) {
                appendPath.appendQueryParameter("account_key", boan.f132472f.mo68794a(this.f51315b));
            }
            wrz wrz = new wrz(context, apr, appendPath.build());
            this.f51321h = wrz;
            recyclerView.setAdapter(wrz);
        }
        MenuItem menuItem = this.f51317d;
        if (menuItem != null) {
            menuItem.setVisible(mo29402e());
        }
        mo29399b();
        TextView textView = this.f51320g;
        if (textView != null) {
            if (!mo29402e()) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            TextView textView2 = this.f51320g;
            if (mo29402e()) {
                str = getString(C0126R.string.fast_pair_device_details_footer_address, this.f51316c);
            } else {
                str = "";
            }
            textView2.setText(str);
        }
        mo29400c();
    }

    /* renamed from: a */
    public final void mo29396a(aiaa aiaa) {
        View view = this.f51318e;
        if (view == null || this.f51319f == null) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68432a("wts", "a", 181, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("DeviceDetail: UpdateHeader but view is null.");
            return;
        }
        ((ImageView) view.findViewById(C0126R.C0129id.icon)).setImageBitmap(wsm.m42216a(aiaa));
        this.f51319f.setText(aiaa.f68520h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo29397a(BluetoothDevice bluetoothDevice) {
        try {
            ayqm.m84613a(bluetoothDevice).mo54282a("removeBond", new Class[0]).mo54280a(new Object[0]);
            wtv.m42254a(getContext(), bvin.FAST_PAIR_DEVICE_FORGOTTEN);
        } catch (ayqn e) {
            bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("wts", "a", 337, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("DeviceDetail: Error removing bond for device=%s", bluetoothDevice);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo29398a(C1350sh shVar, EditText editText, DialogInterface dialogInterface) {
        Button a = shVar.mo15913a(-1);
        a.setEnabled(false);
        bnsl bnsl = (bnsl) wtw.f51331a.mo68390d();
        bnsl.mo68432a("wts", "a", 444, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("DeviceDetail: show RenameDialog for device %s", this.f51316c);
        editText.addTextChangedListener(new wtr(this, a));
    }
}
