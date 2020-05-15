package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.p065ui.DeviceListItemView;
import com.google.android.setupdesign.items.Item;

/* renamed from: aryo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aryo extends Item {

    /* renamed from: a */
    public final D2DDevice f88458a;

    public aryo(Context context, D2DDevice d2DDevice) {
        String str;
        int i;
        sdo.m34959a(d2DDevice);
        this.f88458a = d2DDevice;
        if (d2DDevice != null) {
            str = d2DDevice.f107874c;
        } else {
            str = null;
        }
        mo71395b(str);
        if (cgqs.m146602h()) {
            mo71394a(C1133kh.m17836a(context, (int) C0126R.C0127drawable.quantum_gm_ic_phone_android_gm_blue_36));
        } else {
            mo71394a(C1133kh.m17836a(context, (int) C0126R.C0127drawable.quantum_ic_phone_android_grey600_24));
        }
        if (!cgqs.m146602h()) {
            i = C0126R.C0128layout.sud_items_default;
        } else {
            i = C0126R.C0128layout.smartdevice_device_list_item_padded;
        }
        mo71398d(i);
    }

    /* renamed from: a */
    public final void mo48939a(View view) {
        String str;
        if (cgqs.m146602h()) {
            DeviceListItemView deviceListItemView = (DeviceListItemView) view.findViewById(C0126R.C0129id.device_item);
            CharSequence charSequence = this.f151503e;
            if (charSequence == null) {
                str = "";
            } else {
                str = charSequence.toString();
            }
            deviceListItemView.mo59122a(str);
            Drawable drawable = this.f151502d;
            if (drawable != null) {
                if (!deviceListItemView.f108012i) {
                    ImageView imageView = deviceListItemView.f108010g;
                    if (imageView != null) {
                        imageView.setImageDrawable(drawable);
                    }
                } else {
                    C1334rs.m20107b(deviceListItemView.f108011h, drawable, null, null, null);
                }
            }
        } else {
            super.mo48939a(view);
        }
        view.setId(this.f151489c);
    }
}
