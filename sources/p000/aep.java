package p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: aep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aep extends Activity {

    /* renamed from: a */
    private ComponentName f348a;

    /* renamed from: b */
    private int f349b;

    /* renamed from: c */
    private int[] f350c;

    /* renamed from: a */
    private final boolean m628a() {
        return C1133kh.m17835a(this, "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA_PRIVILEGED") == 0 || C1133kh.m17835a(this, "com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA") == 0;
    }

    /* renamed from: b */
    private final void m629b() {
        ComponentName componentName = this.f348a;
        int i = this.f349b;
        int[] iArr = this.f350c;
        Intent intent = new Intent("com.google.android.clockwork.home.complications.ACTION_CHOOSE_PROVIDER");
        intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME", componentName);
        intent.putExtra("android.support.wearable.complications.EXTRA_COMPLICATION_ID", i);
        intent.putExtra("android.support.wearable.complications.EXTRA_SUPPORTED_TYPES", iArr);
        startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    public final void onCreate(Bundle bundle) {
        char c;
        setTheme(16973840);
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -121457581) {
            if (hashCode == 1414879715 && action.equals("android.support.wearable.complications.ACTION_START_PROVIDER_CHOOSER")) {
                c = 0;
                if (c == 0) {
                    this.f348a = (ComponentName) intent.getParcelableExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME");
                    this.f349b = intent.getIntExtra("android.support.wearable.complications.EXTRA_COMPLICATION_ID", 0);
                    this.f350c = intent.getIntArrayExtra("android.support.wearable.complications.EXTRA_SUPPORTED_TYPES");
                    if (m628a()) {
                        m629b();
                        return;
                    }
                    C1133kh.m17842a(this, new String[]{"com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA"}, 1);
                    return;
                } else if (c == 1) {
                    this.f348a = (ComponentName) intent.getParcelableExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME");
                    if (m628a()) {
                        finish();
                        return;
                    }
                    C1133kh.m17842a(this, new String[]{"com.google.android.wearable.permission.RECEIVE_COMPLICATION_DATA"}, 2);
                    return;
                } else {
                    throw new IllegalStateException("Unrecognised intent action.");
                }
            }
        } else if (action.equals("android.support.wearable.complications.ACTION_PERMISSION_REQUEST_ONLY")) {
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            if (i != 1) {
                finish();
            } else {
                m629b();
            }
            ComponentName componentName = this.f348a;
            Intent intent = new Intent("android.support.wearable.complications.ACTION_REQUEST_UPDATE_ALL_ACTIVE");
            intent.setPackage("com.google.android.wearable.app");
            intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT", componentName);
            intent.putExtra("android.support.wearable.complications.EXTRA_PENDING_INTENT", PendingIntent.getActivity(this, 0, new Intent(""), 0));
            sendBroadcast(intent);
            return;
        }
        finish();
    }
}
