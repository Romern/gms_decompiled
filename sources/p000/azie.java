package p000;

import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.p002v7.widget.SwitchCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.List;

/* renamed from: azie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azie implements Runnable {

    /* renamed from: a */
    final /* synthetic */ azif f99466a;

    public azie(azif azif) {
        this.f99466a = azif;
    }

    public final void run() {
        String str;
        int length;
        azif azif = this.f99466a;
        azik azik = azif.f99468b;
        View view = azif.f99467a;
        boolean e = azik.f99481e.mo54592e();
        azik.f99479c = e;
        azik.f99480d = e;
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.app_icon);
        byte[] d = azik.f99481e.mo54591d();
        if (d != null && (length = d.length) > 0) {
            imageView.setImageDrawable(new BitmapDrawable(azik.getResources(), BitmapFactory.decodeByteArray(d, 0, length)));
        } else {
            imageView.setImageDrawable(new BitmapDrawable(azik.getResources(), azpi.m86076b(azik.getContext())));
        }
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(C0126R.C0129id.app_toggle);
        switchCompat.setText(azik.f99481e.mo54590c());
        switchCompat.setChecked(!azik.f99481e.mo54592e());
        switchCompat.setOnClickListener(new azig(azik, switchCompat));
        String aF = cfeo.f183719a.mo6606a().mo80946aF();
        if (!aF.equals("all")) {
            for (String str2 : bmyx.m108640a(',').mo66918a((CharSequence) aF)) {
                if (azik.f99478b.equals(str2)) {
                }
            }
            return;
        }
        new azii(azik, view).start();
        RadioGroup radioGroup = (RadioGroup) view.findViewById(C0126R.C0129id.radio_group);
        StringBuilder sb = new StringBuilder();
        List list = azik.f99477a;
        if (list == null || list.isEmpty()) {
            azoj.m85932b("AppSettingsFragment", "All users are not initialized properly.", new Object[0]);
            return;
        }
        radioGroup.removeAllViews();
        Cursor query = azcv.m85357a(azik.getContext()).f99016a.getContentResolver().query(DatabaseProvider.m94541e(azik.f99478b), new String[]{"default_user_id", "default_user_type", "default_user_app_id"}, null, null, null);
        LocalEntityId localEntityId = null;
        if (query != null && query.moveToFirst()) {
            String string = query.getString(query.getColumnIndex("default_user_id"));
            int i = query.getInt(query.getColumnIndex("default_user_type"));
            String string2 = query.getString(query.getColumnIndex("default_user_app_id"));
            if (!TextUtils.isEmpty(string) && i != 0 && !TextUtils.isEmpty(string2)) {
                localEntityId = new LocalEntityId(string, i, string2);
            }
        }
        if (query != null) {
            query.close();
        }
        List list2 = azik.f99477a;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            LocalEntityId localEntityId2 = (LocalEntityId) list2.get(i2);
            if (localEntityId2.f111075b == 7 && !localEntityId2.equals(azik.f99477a.get(0))) {
                View view2 = new View(azik.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, azik.mo54949a(1));
                int i3 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginStart(azik.mo54949a(62));
                marginLayoutParams.setMargins(azik.mo54949a(62), azik.mo54949a(14), 0, azik.mo54949a(14));
                view2.setLayoutParams(marginLayoutParams);
                view2.setBackgroundColor(-3355444);
                radioGroup.addView(view2);
            }
            RadioButton radioButton = new RadioButton(azik.getContext());
            if (localEntityId2.f111075b == 1) {
                str = azot.m85964a(localEntityId2.f111074a, (TelephonyManager) azik.getContext().getSystemService("phone"));
            } else {
                str = localEntityId2.f111074a;
            }
            radioButton.setText(str);
            radioButton.setTextSize(1, 16.0f);
            radioButton.setPadding(azik.mo54949a(30), 0, azik.mo54949a(30), 0);
            radioButton.setLayoutParams(new ViewGroup.LayoutParams(-1, azik.mo54949a(48)));
            radioButton.setOnClickListener(new azij(azik, localEntityId2));
            radioGroup.addView(radioButton);
            if (localEntityId == null || !localEntityId2.equals(localEntityId)) {
                sb.append("not checked ");
                sb.append(str);
                sb.append(" ");
            } else {
                radioButton.setChecked(true);
                sb.append("checked ");
                sb.append(str);
                sb.append(" ");
            }
        }
        radioGroup.setContentDescription(sb.toString());
    }
}
