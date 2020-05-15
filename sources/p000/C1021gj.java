package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: gj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1021gj extends ago implements C0997fr {

    /* renamed from: a */
    final C1032gt f18324a;

    /* renamed from: b */
    final C0015am f18325b = new C0015am(this);

    /* renamed from: c */
    boolean f18326c;

    /* renamed from: d */
    boolean f18327d;

    /* renamed from: e */
    boolean f18328e = true;

    /* renamed from: f */
    boolean f18329f;

    /* renamed from: g */
    boolean f18330g;

    /* renamed from: h */
    int f18331h;

    /* renamed from: i */
    C1246ol f18332i;

    public C1021gj() {
        C1019gi giVar = new C1019gi(this);
        C1244oj.m19767a(giVar, "callbacks == null");
        this.f18324a = new C1032gt(giVar);
    }

    /* renamed from: a */
    private static boolean m13232a(C1050hj hjVar, C0007ae aeVar) {
        boolean z = false;
        for (C1018gh ghVar : hjVar.mo12552e()) {
            if (ghVar != null) {
                if (ghVar.getHost() != null) {
                    z |= m13232a(ghVar.getChildFragmentManager(), aeVar);
                }
                if (ghVar.getLifecycle().mo556a().mo482a(C0007ae.STARTED)) {
                    ghVar.f18184U.mo1024a(aeVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    static void m13233b(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: d */
    private final void mo8657d() {
        do {
        } while (m13232a(mo11924aK(), C0007ae.CREATED));
    }

    /* renamed from: a */
    public void mo11920a(C1018gh ghVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: aH */
    public void mo11923aH() {
        this.f18325b.mo1023a(C0005ad.ON_RESUME);
        this.f18324a.f18980a.f19061e.mo12563k();
    }

    /* renamed from: aK */
    public final C1050hj mo11924aK() {
        return this.f18324a.mo12190a();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f18326c);
        printWriter.print(" mResumed=");
        printWriter.print(this.f18327d);
        printWriter.print(" mStopped=");
        printWriter.print(this.f18328e);
        if (getApplication() != null) {
            C1087iq.m15879a(this).mo13250a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f18324a.mo12190a().mo12528a(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f18324a.mo12191b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.f18332i.mo15646f(i4);
            this.f18332i.mo15636a(i4);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            C1018gh a = this.f18324a.mo12189a(str);
            if (a == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
                return;
            }
            a.onActivityResult((char) i, i2, intent);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f18324a.mo12191b();
        this.f18324a.f18980a.f19061e.mo12519a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length;
        C1034gv gvVar = this.f18324a.f18980a;
        gvVar.f19061e.mo12524a(gvVar, gvVar, (C1018gh) null);
        if (bundle != null) {
            this.f18324a.f18980a.f19061e.mo12520a(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f18331h = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || (length = intArray.length) != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f18332i = new C1246ol(length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f18332i.mo15637a(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f18332i == null) {
            this.f18332i = new C1246ol();
            this.f18331h = 0;
        }
        super.onCreate(bundle);
        this.f18325b.mo1023a(C0005ad.ON_CREATE);
        this.f18324a.f18980a.f19061e.mo12557h();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(0, menu);
        C1032gt gtVar = this.f18324a;
        return onCreatePanelMenu | gtVar.f18980a.f19061e.mo12530a(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo11919a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f18324a.f18980a.f19061e.mo12568n();
        this.f18325b.mo1023a(C0005ad.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f18324a.f18980a.f19061e.mo12570o();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f18324a.f18980a.f19061e.mo12531a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f18324a.f18980a.f19061e.mo12543b(menuItem);
    }

    public final void onMultiWindowModeChanged(boolean z) {
        this.f18324a.f18980a.f19061e.mo12542b(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f18324a.mo12191b();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f18324a.f18980a.f19061e.mo12539b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18327d = false;
        this.f18324a.f18980a.f19061e.mo12565l();
        this.f18325b.mo1023a(C0005ad.ON_PAUSE);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        this.f18324a.f18980a.f19061e.mo12547c(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo11923aH();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return mo11922a(view, menu) | this.f18324a.f18980a.f19061e.mo12529a(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f18324a.mo12191b();
        super.onRequestPermissionsResult(i, strArr, iArr);
        char c = (char) (i >> 16);
        if (c != 0) {
            int i2 = c - 1;
            String str = (String) this.f18332i.mo15646f(i2);
            this.f18332i.mo15636a(i2);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.f18324a.mo12189a(str) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18327d = true;
        this.f18324a.mo12191b();
        this.f18324a.mo12192c();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo8657d();
        this.f18325b.mo1023a(C0005ad.ON_STOP);
        Parcelable g = this.f18324a.f18980a.f19061e.mo12555g();
        if (g != null) {
            bundle.putParcelable("android:support:fragments", g);
        }
        if (this.f18332i.mo15640c() > 0) {
            bundle.putInt("android:support:next_request_index", this.f18331h);
            int[] iArr = new int[this.f18332i.mo15640c()];
            String[] strArr = new String[this.f18332i.mo15640c()];
            for (int i = 0; i < this.f18332i.mo15640c(); i++) {
                iArr[i] = this.f18332i.mo15638b(i);
                strArr[i] = (String) this.f18332i.mo15641c(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f18328e = false;
        if (!this.f18326c) {
            this.f18326c = true;
            this.f18324a.f18980a.f19061e.mo12559i();
        }
        this.f18324a.mo12191b();
        this.f18324a.mo12192c();
        this.f18325b.mo1023a(C0005ad.ON_START);
        this.f18324a.f18980a.f19061e.mo12561j();
    }

    public void onStateNotSaved() {
        this.f18324a.mo12191b();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f18328e = true;
        mo8657d();
        this.f18324a.f18980a.f19061e.mo12567m();
        this.f18325b.mo1023a(C0005ad.ON_STOP);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.f18330g && i != -1) {
            m13233b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f18329f && i != -1) {
            m13233b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    /* renamed from: b */
    public final int mo11925b(C1018gh ghVar) {
        if (this.f18332i.mo15640c() < 65534) {
            while (this.f18332i.mo15643d(this.f18331h) >= 0) {
                this.f18331h = (this.f18331h + 1) % 65534;
            }
            int i = this.f18331h;
            this.f18332i.mo15637a(i, ghVar.f18192i);
            this.f18331h = (this.f18331h + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo11919a(null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f18330g && i != -1) {
            m13233b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f18329f && i != -1) {
            m13233b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo11919a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f18324a.f18980a.f19061e.f19852c.onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    /* renamed from: b */
    public void mo8650b() {
        invalidateOptionsMenu();
    }

    /* renamed from: a */
    public final void mo11182a(int i) {
        m13233b(i);
    }

    /* renamed from: a */
    public final void mo11921a(C1018gh ghVar, Intent intent, int i) {
        this.f18330g = true;
        if (i != -1) {
            try {
                m13233b(i);
                C1133kh.m17840a(this, intent, ((mo11925b(ghVar) + 1) << 16) + ((char) i));
            } finally {
                this.f18330g = false;
            }
        } else {
            C1133kh.m17840a(this, intent, -1);
            this.f18330g = false;
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public boolean mo11922a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }
}
