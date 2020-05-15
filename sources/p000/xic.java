package p000;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier;
import com.google.android.gms.fido.u2f.api.view.BleSelectViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.ArrayDeque;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xic extends FragmentActivity {

    /* renamed from: c */
    public static final Logger f52325c = new Logger(new String[]{"AuthenticateBaseChimeraActivity"}, (short[]) null);

    /* renamed from: a */
    protected FragmentManager f52326a;

    /* renamed from: b */
    public ycc f52327b;

    /* renamed from: d */
    private ArrayDeque f52328d;

    /* renamed from: d */
    private final void m42985d() {
        ViewOptions viewOptions;
        ycv ycv = (ycv) this.f52328d.peek();
        if (ycv != null) {
            viewOptions = ycv.mo30351b();
        } else {
            viewOptions = null;
        }
        if (viewOptions != null) {
            mo18790b(viewOptions);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo29785a() {
        f52325c.mo25412b("cancel", new Object[0]);
        mo18788a(StateUpdate.f31874d);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18788a(StateUpdate stateUpdate);

    /* renamed from: b */
    public abstract void mo18789b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo18790b(ViewOptions viewOptions);

    /* renamed from: c */
    public final void mo29792c() {
        f52325c.mo25412b("disableNfcReaderMode", new Object[0]);
        xhy a = xhy.m42973a(getApplicationContext());
        if (a != null) {
            a.mo29773a(getContainerActivity());
        } else {
            f52325c.mo25418e("disableNfcReaderMode: NfcAdapterApi19.getDefaultAdapter is null!", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010d  */
    public final void onBackPressed() {
        if (this.f52326a == null) {
            this.f52326a = getSupportFragmentManager();
        }
        int backStackEntryCount = this.f52326a.getBackStackEntryCount();
        if (backStackEntryCount <= 1) {
            f52325c.mo25414c("Exit activity.", new Object[0]);
            mo29785a();
            return;
        }
        String name = this.f52326a.getBackStackEntryAt(backStackEntryCount - 1).getName();
        String name2 = this.f52326a.getBackStackEntryAt(backStackEntryCount - 2).getName();
        if (name.equals(ycu.BLE_PROCESSING_FRAGMENT.f53635q) || name.equals(ycu.BLE_PAIR_DEVICE_FRAGMENT.f53635q)) {
            f52325c.mo25414c("Ignore back button press.", new Object[0]);
        } else if (name.equals(ycu.BLE_LOCATE_PIN_FRAGMENT.f53635q) && name2.equals(ycu.BLE_SELECT_DEVICE_FRAGMENT.f53635q)) {
            f52325c.mo25414c("Go back to BLE_SELECT_DEVICE.", new Object[0]);
            this.f52328d.pop();
            this.f52326a.popBackStack();
            mo29791a(ycs.m43814a(new BleSelectViewOptions(false)));
            m42985d();
        } else if (name.equals(ycu.BLE_SELECT_DEVICE_FRAGMENT.f53635q)) {
            if (name2.equals(ycu.BLE_PAIRING_MODE_FRAGMENT.f53635q)) {
                f52325c.mo25414c("Skip BLE_PAIRING_MODE when back from BLE_SELECT_DEVICE", new Object[0]);
                while (this.f52328d.peek() != null && !((ycv) this.f52328d.pop()).mo30350a().equals(ycu.BLE_PAIRING_MODE_FRAGMENT)) {
                    while (this.f52328d.peek() != null) {
                        while (this.f52328d.peek() != null) {
                        }
                    }
                }
                this.f52326a.popBackStack(ycu.BLE_PAIRING_MODE_FRAGMENT.f53635q, 1);
            } else {
                this.f52328d.pop();
                this.f52326a.popBackStack();
            }
            m42985d();
        } else if (name2.equals(ycu.BLE_ENABLE_FRAGMENT.f53635q) || name2.equals(ycu.NFC_ENABLE_FRAGMENT.f53635q)) {
            f52325c.mo25414c("Skip BLE_ENABLE or NFC_ENABLE.", new Object[0]);
            while (this.f52328d.peek() != null && !((ycv) this.f52328d.pop()).mo30350a().f53635q.equals(name2)) {
                while (this.f52328d.peek() != null) {
                    while (this.f52328d.peek() != null) {
                    }
                }
            }
            this.f52326a.popBackStack(name2, 1);
            m42985d();
        } else {
            this.f52328d.pop();
            this.f52326a.popBackStack();
            m42985d();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f52328d = new ArrayDeque();
    }

    public final void onDestroy() {
        f52325c.mo25412b("onDestroy", new Object[0]);
        mo18788a(StateUpdate.f31874d);
        super.onDestroy();
    }

    public final void onPause() {
        f52325c.mo25412b("onPause", new Object[0]);
        mo18788a(StateUpdate.f31872b);
        super.onPause();
    }

    /* renamed from: a */
    public final void mo29786a(Transport transport) {
        f52325c.mo25414c("User selected transport %s", transport.f31675g);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("transport", transport.f31675g);
            mo18788a(new StateUpdate(StateUpdate.Type.SELECT_TRANSPORT_VIEW, jSONObject));
        } catch (JSONException e) {
            f52325c.mo25418e("Unexpected JSONException", new Object[0]);
            setResult(1);
        }
    }

    /* renamed from: a */
    public final void mo29787a(BleDeviceIdentifier bleDeviceIdentifier) {
        f52325c.mo25414c("User selected device %s", bleDeviceIdentifier.mo18664a().toString());
        mo18788a(new StateUpdate(StateUpdate.Type.DEVICE_SELECTION, bleDeviceIdentifier.mo18664a()));
    }

    /* renamed from: a */
    public final void mo29788a(ViewOptions viewOptions) {
        f52325c.mo25414c("User selected view %s", viewOptions.toString());
        mo18788a(new StateUpdate(StateUpdate.Type.SELECT_VIEW, viewOptions.mo18664a()));
    }

    /* renamed from: a */
    public final void mo29789a(String str, yas yas) {
        try {
            yas.mo14326a(ViewOptions.m23647a(new JSONObject(str)));
        } catch (JSONException e) {
            f52325c.mo25417e("Invalid ViewOptions json.", e, new Object[0]);
            setResult(1);
        }
    }

    /* renamed from: a */
    public final void mo29790a(xhx xhx, int i) {
        f52325c.mo25412b("enabledNfcReaderMode", new Object[0]);
        xib xib = new xib(xhx);
        xhy a = xhy.m42973a(getApplicationContext());
        if (a != null) {
            a.mo29774a(getContainerActivity(), xib, i);
            if (cdwf.f181834a.mo6606a().mo78391a()) {
                try {
                    a.f52322a.disableForegroundDispatch(getContainerActivity());
                } catch (Exception e) {
                    f52325c.mo25417e("Error when calling NfcAdapter.disableForegroundDispatch().", e, new Object[0]);
                }
            }
        } else {
            f52325c.mo25418e("enabledNfcReaderMode: NfcAdapterApi19.getDefaultAdapter is null!", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo29791a(ycv ycv) {
        if (this.f52326a == null) {
            this.f52326a = getSupportFragmentManager();
        }
        if (this.f52326a.isDestroyed()) {
            f52325c.mo25418e("commitFragmentChange failed because the FragmentManager is destroyed!", new Object[0]);
            return;
        }
        FragmentTransaction beginTransaction = this.f52326a.beginTransaction();
        if (ycv.mo30350a().equals(ycu.BLE_SELECT_DEVICE_FRAGMENT) && this.f52328d.peek() != null && ((ycv) this.f52328d.peek()).mo30350a().equals(ycu.BLE_SELECT_DEVICE_FRAGMENT)) {
            this.f52328d.pop();
            this.f52326a.popBackStack();
        }
        this.f52328d.push(ycv);
        beginTransaction.replace(C0126R.C0129id.authenticate_fragment_container, (Fragment) ycv);
        beginTransaction.addToBackStack(ycv.mo30350a().f53635q);
        beginTransaction.commitAllowingStateLoss();
    }
}
