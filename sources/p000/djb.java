package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.Activity;
import com.google.android.chimera.config.FeatureRequestExtras;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: djb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class djb extends Activity {

    /* renamed from: a */
    private boolean f13301a;

    /* renamed from: b */
    private String f13302b = null;

    /* renamed from: c */
    private ModuleManager.FeatureList f13303c = null;

    /* renamed from: d */
    private FeatureRequestExtras.ResultBuilder f13304d = null;

    /* renamed from: e */
    private int f13305e = -1;

    /* renamed from: f */
    private boolean f13306f = false;

    /* renamed from: a */
    static Intent m8624a(String str) {
        return new Intent("com.google.android.chimera.container.EXTRACT_MODULE_WITH_UI").putExtra("asset_name", str);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        FeatureRequestExtras.ResultReader fromIntent;
        if (i == 1) {
            if (!this.f13301a) {
                this.f13305e = i2;
                this.f13306f = false;
                if (i2 != 0) {
                    ((dfb) getContainerActivity()).f12999o = false;
                    if (m8625a(this, this.f13301a, this.f13303c)) {
                        this.f13306f = true;
                    }
                }
            } else if (i2 != 0) {
                ((dfb) getContainerActivity()).f12999o = false;
                if (new FeatureRequestExtras.RequestReader(getIntent()).hasFeatureRequest() && (fromIntent = FeatureRequestExtras.ResultReader.fromIntent(intent)) != null) {
                    FeatureRequestExtras.ResultBuilder resultBuilder = new FeatureRequestExtras.ResultBuilder();
                    resultBuilder.setDownloadResult(fromIntent.getDownloadResultCode());
                    this.f13304d = resultBuilder;
                }
            }
        } else if (i != 2) {
        } else {
            if (i2 != 0) {
                ((dfb) getContainerActivity()).f12999o = false;
                this.f13306f = true;
                return;
            }
            mo9123a((Intent) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        if (r5.isEmpty() == false) goto L_0x012e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135  */
    public final void onCreate(Bundle bundle) {
        ComponentName componentName;
        Bundle bundle2;
        ModuleManager.FeatureList featureList;
        ArrayList arrayList;
        long j;
        super.onCreate(bundle);
        if (!cdjh.f180979a.mo6606a().mo77727G()) {
            componentName = getContainerActivity().getComponentName();
        } else {
            componentName = new ComponentName(this, getContainerActivity().getClass().getName());
        }
        try {
            ActivityInfo activityInfo = getPackageManager().getActivityInfo(componentName, 640);
            if (activityInfo.metaData != null) {
                bundle2 = activityInfo.metaData;
            } else {
                bundle2 = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Failed to fetch <meta-data> for ");
            sb.append(valueOf);
            Log.e("ChimeraFallbackActivity", sb.toString());
            bundle2 = Bundle.EMPTY;
        }
        String string = bundle2.getString("chimera.requested_features");
        if (string != null) {
            if (!string.isEmpty()) {
                String[] split = string.split(",");
                int length = split.length;
                arrayList = new ArrayList(length);
                Pattern compile = Pattern.compile("(\\w+)(?::(\\*|(?:\\d+)))?");
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i < length) {
                        String str = split[i];
                        if (!str.isEmpty()) {
                            Matcher matcher = compile.matcher(str);
                            if (matcher.matches()) {
                                String group = matcher.group(2);
                                if (group == null) {
                                    j = 0;
                                } else if (!"*".equals(group)) {
                                    try {
                                        j = Long.parseLong(matcher.group(2));
                                    } catch (NumberFormatException e2) {
                                        Log.e("FeatureMgr", string.length() == 0 ? new String("Malformed feature descriptor: ") : "Malformed feature descriptor: ".concat(string));
                                        arrayList = null;
                                    }
                                } else {
                                    j = -1;
                                }
                                bxvd da = djd.f13314d.mo74144da();
                                String group2 = matcher.group(1);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = z;
                                }
                                djd djd = (djd) da.f164949b;
                                group2.getClass();
                                int i2 = djd.f13316a | 1;
                                djd.f13316a = i2;
                                djd.f13317b = group2;
                                djd.f13316a = i2 | 2;
                                djd.f13318c = j;
                                arrayList.add((djd) da.mo74062i());
                            } else {
                                Log.e("FeatureMgr", string.length() == 0 ? new String("Malformed feature descriptor: ") : "Malformed feature descriptor: ".concat(string));
                                arrayList = null;
                            }
                        }
                        i++;
                        z = false;
                    }
                }
                if (arrayList == null) {
                    featureList = ModuleManager.FeatureList.fromDescriptors(arrayList);
                } else {
                    featureList = null;
                }
            }
            arrayList = null;
            if (arrayList == null) {
            }
        } else {
            featureList = null;
        }
        this.f13303c = featureList;
        dfq.m8314a();
        if (cdjl.m133596b()) {
            this.f13302b = bundle2.getString("chimera.requiresExtractedAsset");
        }
        this.f13301a = cdjh.f180979a.mo6606a().mo77723C();
    }

    public final void onResume() {
        super.onResume();
        boolean z = ((dfb) getContainerActivity()).f12999o;
        Intent intent = null;
        if (this.f13301a) {
            if (!this.f13306f && !m8625a(this, true, this.f13303c)) {
                if (z) {
                    ModuleManager.FeatureList featureList = this.f13303c;
                    if (featureList == null) {
                        String str = this.f13302b;
                        if (str != null) {
                            startActivityForResult(m8624a(str), 2);
                            return;
                        }
                    } else {
                        bmxy.m108581a(featureList);
                        startActivityForResult(dgh.m8388a(featureList).putExtras(getIntent()), 1);
                        return;
                    }
                }
                if (this.f13304d != null) {
                    intent = new Intent();
                    this.f13304d.addToIntent(intent);
                }
                mo9123a(intent);
                return;
            }
            ((dfb) getContainerActivity()).f12999o = false;
            recreate();
        } else if (this.f13306f) {
            recreate();
        } else {
            if (z) {
                if (this.f13305e != 0 && m8625a(this, false, this.f13303c)) {
                    String str2 = this.f13302b;
                    if (str2 != null) {
                        startActivityForResult(m8624a(str2), 2);
                        return;
                    }
                } else {
                    ModuleManager.FeatureList featureList2 = this.f13303c;
                    bmxy.m108581a(featureList2);
                    startActivityForResult(dgh.m8388a(featureList2).putExtras(getIntent()), 1);
                    return;
                }
            }
            mo9123a((Intent) null);
        }
    }

    /* renamed from: a */
    private static boolean m8625a(Context context, boolean z, ModuleManager.FeatureList featureList) {
        if (featureList == null) {
            return !z;
        }
        int checkFeaturesAreAvailable = ModuleManager.get(context).checkFeaturesAreAvailable(featureList);
        if (checkFeaturesAreAvailable == 0) {
            return true;
        }
        if (checkFeaturesAreAvailable == 1 || checkFeaturesAreAvailable == 2) {
            return false;
        }
        Log.w("ChimeraFallbackActivity", "Failed to check features");
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9123a(Intent intent) {
        if (intent == null) {
            setResult(0);
        } else {
            setResult(0, intent);
        }
        finish();
    }
}
