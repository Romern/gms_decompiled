package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: fut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fut {

    /* renamed from: a */
    public final Intent f17305a;

    public fut() {
        Intent intent = new Intent("com.google.android.gms.appinvite.ACTION_CONTEXTUAL_PEOPLE_SELECTION");
        this.f17305a = intent;
        intent.setPackage("com.google.android.gms");
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
    /* renamed from: a */
    public final void mo11358a() {
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_SELECTION", true);
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
    /* renamed from: b */
    public final void mo11363b() {
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_DOCK_RECIPIENTS", true);
    }

    /* renamed from: c */
    public final void mo11367c() {
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_MAX_PORTRAIT_GRID_ITEMS", 6);
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_MAX_LANDSCAPE_GRID_ITEMS", 6);
    }

    /* renamed from: a */
    public final void mo11359a(int i) {
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_MAX_SELECTED", i);
    }

    /* renamed from: b */
    public final void mo11364b(int i) {
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_APPEARANCE", i);
    }

    /* renamed from: c */
    public final void mo11368c(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putIntArray(Integer.toString(0), new int[]{i2, -16842910});
        bundle.putIntArray(Integer.toString(1), new int[]{i});
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR_STATES", bundle);
    }

    /* renamed from: a */
    public final void mo11360a(int i, int i2) {
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_COLOR", i);
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_BACKGROUND_COLOR", i2);
    }

    /* renamed from: b */
    public final void mo11365b(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putIntArray(Integer.toString(0), new int[]{i2, -16842910});
        bundle.putIntArray(Integer.toString(1), new int[]{i});
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR_STATES", bundle);
    }

    /* renamed from: a */
    public final void mo11361a(String str) {
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_ACCOUNT_NAME", str);
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
    /* renamed from: a */
    public final void mo11362a(String[] strArr) {
        if (cbwa.m128704c() || cbwa.m128703b()) {
            HashSet hashSet = new HashSet(Arrays.asList(strArr));
            if (hashSet.remove("google_no_icon") && cbwa.m128704c()) {
                this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_ICON", true);
            }
            if (hashSet.remove("exclude_non_gaia") && cbwa.m128703b()) {
                this.f17305a.putExtra("com.google.android.gms.appinvite.EXTRA_EXCLUDE_NON_GAIA_CONTACTS", true);
            }
            this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_TYPES", (String[]) hashSet.toArray(new String[hashSet.size()]));
            return;
        }
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_TYPES", strArr);
    }

    /* renamed from: c */
    public final void mo11369c(String str) {
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_LIST_SOURCE", str);
    }

    /* renamed from: b */
    public final void mo11366b(String str) {
        this.f17305a.putExtra("com.google.android.gms.appinvite.CONTEXT_GRID_SOURCE", str);
    }
}
