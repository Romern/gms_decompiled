package com.google.android.chimera.config;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleManager {
    public static final int FEATURE_CHECK_ERROR = 3;
    public static final int FEATURE_CHECK_SUCCESS = 0;
    public static final int FEATURE_CHECK_UNKNOWN_FEATURE = 1;
    public static final int FEATURE_CHECK_UPDATE_REQUIRED = 2;
    @ChimeraApiVersion(added = 105)
    public static final int FEATURE_REQUEST_RESULT_FAILURE = 1;
    @ChimeraApiVersion(added = 105)
    public static final int FEATURE_REQUEST_RESULT_FAILURE_NO_RETRY = 2;
    @ChimeraApiVersion(added = 105)
    public static final int FEATURE_REQUEST_RESULT_SUCCESS = 0;

    /* renamed from: e */
    private static final WeakHashMap f7675e = new WeakHashMap();

    /* renamed from: f */
    private static final Object f7676f = new Object();

    /* renamed from: g */
    private static volatile Uri f7677g;

    /* renamed from: a */
    private final Context f7678a;

    /* renamed from: b */
    private final ModuleContext f7679b;

    /* renamed from: c */
    private ModuleInfo f7680c;

    /* renamed from: d */
    private ModuleApkInfo f7681d;

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class BasicModuleInfo {
        public final String moduleId;
        public final int moduleVersion;

        public BasicModuleInfo(String str, int i) {
            this.moduleId = str;
            this.moduleVersion = i;
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ConfigInfo {
        public final int chimeraConfigModifierFlags;
        public final Collection moduleSets;
        public final Collection optionalModules;

        @ChimeraApiVersion(added = 0)
        @Retention(RetentionPolicy.SOURCE)
        /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
        public @interface ChimeraConfigModifierFlags {
            public static final int HAS_BLACKLISTED_MODULES = 1;
        }

        public ConfigInfo(List list, List list2, int i) {
            this.moduleSets = Collections.unmodifiableList(list);
            this.optionalModules = Collections.unmodifiableList(list2);
            this.chimeraConfigModifierFlags = i;
        }
    }

    @ChimeraApiVersion(added = 104)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class FeatureCheck {

        /* renamed from: a */
        public final List f7682a = new ArrayList();

        /* renamed from: a */
        private final void m4865a(String str, long j) {
            List list = this.f7682a;
            bxvd da = djd.f13314d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            djd djd = (djd) da.f164949b;
            str.getClass();
            int i = djd.f13316a | 1;
            djd.f13316a = i;
            djd.f13317b = str;
            djd.f13316a = i | 2;
            djd.f13318c = j;
            list.add((djd) da.mo74062i());
        }

        public FeatureCheck checkFeatureAtAnyVersion(String str) {
            m4865a(str, 0);
            return this;
        }

        public FeatureCheck checkFeatureAtLatestVersion(String str) {
            m4865a(str, -1);
            return this;
        }

        public FeatureCheck checkFeatureAtVersion(String str, long j) {
            bmxy.m108588a(j > 0);
            m4865a(str, j);
            return this;
        }

        public List getFeatureDescriptors() {
            return bngx.m109368a((Collection) this.f7682a);
        }
    }

    @ChimeraApiVersion(added = 0)
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public @interface FeatureCheckResult {
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class FeatureList {

        /* renamed from: a */
        private final byte[] f7683a;

        private FeatureList(byte[] bArr) {
            this.f7683a = bArr;
        }

        public static FeatureList fromDescriptors(List list) {
            bxvd da = djf.f13322b.mo74144da();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                djd djd = (djd) list.get(i);
                bxvd da2 = djc.f13307f.mo74144da();
                String str = djd.f13317b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                djc djc = (djc) da2.f164949b;
                str.getClass();
                int i2 = djc.f13309a | 1;
                djc.f13309a = i2;
                djc.f13310b = str;
                long j = djd.f13318c;
                djc.f13309a = i2 | 2;
                djc.f13311c = j;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                djf djf = (djf) da.f164949b;
                djc djc2 = (djc) da2.mo74062i();
                djc2.getClass();
                djf.mo9124a();
                djf.f13324a.add(djc2);
            }
            return new FeatureList(((djf) da.mo74062i()).mo73642k());
        }

        public static FeatureList fromFeatures(List list) {
            bxvd da = djf.f13322b.mo74144da();
            da.mo74065i(list);
            return new FeatureList(((djf) da.mo74062i()).mo73642k());
        }

        public static FeatureList fromProto(byte[] bArr) {
            return new FeatureList(bArr);
        }

        public byte[] getProtoBytes() {
            return this.f7683a;
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class FeatureRequest {

        /* renamed from: a */
        private final C1245ok f7684a = new C1245ok();

        /* renamed from: b */
        private final C1225nr f7685b = new C1225nr();

        /* renamed from: c */
        private boolean f7686c = false;

        /* renamed from: d */
        private boolean f7687d = false;

        /* renamed from: e */
        private FeatureRequestProgressListener f7688e = null;

        /* renamed from: f */
        private String f7689f = null;

        /* renamed from: a */
        private final void m4866a(String str, long j) {
            this.f7684a.put(str, Long.valueOf(j));
        }

        public FeatureRequest requestFeatureAtAnyVersion(String str) {
            m4866a(str, 0);
            return this;
        }

        public FeatureRequest requestFeatureAtLatestVersion(String str) {
            m4866a(str, -1);
            return this;
        }

        public FeatureRequest requestFeatureAtVersion(String str, long j) {
            bmxy.m108588a(j > 0);
            m4866a(str, j);
            return this;
        }

        public FeatureRequest requestFeatures(FeatureList featureList) {
            boolean z;
            bxwc bxwc = ((djf) bxvk.m124016a(djf.f13322b, featureList.getProtoBytes(), bxus.m123743b())).f13324a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                djc djc = (djc) bxwc.get(i);
                long j = djc.f13311c;
                if (j >= -1) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108588a(z);
                m4866a(djc.f13310b, j);
            }
            return this;
        }

        public FeatureRequest setForceUnrequest() {
            this.f7686c = true;
            return this;
        }

        @ChimeraApiVersion(added = 106)
        public FeatureRequest setSessionId(String str) {
            this.f7689f = str;
            return this;
        }

        public FeatureRequest setUrgent() {
            this.f7687d = true;
            return this;
        }

        public FeatureRequest setUrgent(FeatureRequestProgressListener featureRequestProgressListener) {
            this.f7687d = true;
            this.f7688e = featureRequestProgressListener;
            return this;
        }

        public Bundle toContractBundle(String str) {
            dew dew;
            C1245ok okVar = this.f7684a;
            C1225nr nrVar = this.f7685b;
            boolean z = this.f7686c;
            boolean z2 = this.f7687d;
            FeatureRequestProgressListener featureRequestProgressListener = this.f7688e;
            if (featureRequestProgressListener != null) {
                dew = featureRequestProgressListener.mo6245a();
            } else {
                dew = null;
            }
            String str2 = this.f7689f;
            Bundle bundle = new Bundle();
            bundle.putString("requester", str);
            bundle.putBoolean("forceUnrequest", z);
            bundle.putBoolean("urgent", z2);
            dkz.m8775a(bundle, "listener", dew);
            if (!okVar.isEmpty()) {
                int i = okVar.f26809h;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    bxvd da = djd.f13314d.mo74144da();
                    String str3 = (String) okVar.mo15620b(i2);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    djd djd = (djd) da.f164949b;
                    str3.getClass();
                    djd.f13316a |= 1;
                    djd.f13317b = str3;
                    long longValue = ((Long) okVar.mo15621c(i2)).longValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    djd djd2 = (djd) da.f164949b;
                    djd2.f13316a |= 2;
                    djd2.f13318c = longValue;
                    arrayList.add((djd) da.mo74062i());
                }
                bxvd da2 = dje.f13319b.mo74144da();
                da2.mo74060h(arrayList);
                bundle.putByteArray("requested", ((dje) da2.mo74062i()).mo73642k());
            }
            if (!nrVar.isEmpty()) {
                bundle.putStringArrayList("unrequested", new ArrayList(nrVar));
            }
            if (str2 != null) {
                bundle.putString("sessionId", str2);
            }
            return bundle;
        }

        public FeatureRequest unrequestFeature(String str) {
            this.f7685b.add(str);
            return this;
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public abstract class FeatureRequestProgressListener {

        /* renamed from: a */
        private dew f7690a = null;

        /* renamed from: a */
        public final synchronized dew mo6245a() {
            if (this.f7690a == null) {
                this.f7690a = new dew(this);
            }
            return this.f7690a;
        }

        @Deprecated
        public void onRequestComplete() {
        }

        @ChimeraApiVersion(added = 105)
        public void onRequestComplete(int i) {
            onRequestComplete();
        }
    }

    @ChimeraApiVersion(added = 105)
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public @interface FeatureRequestResult {
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ModuleApkInfo {
        public final String apkPackageName;
        public final boolean apkRequired;
        public final long apkTimestamp;
        public final int apkType;
        public final int apkVersionCode;
        public final String apkVersionName;

        public ModuleApkInfo(djy djy) {
            this.apkPackageName = djy.mo9155f();
            this.apkVersionName = djy.mo9156g();
            this.apkVersionCode = djy.mo9157h();
            this.apkType = djy.mo9149a();
            this.apkTimestamp = djy.mo9153d();
            this.apkRequired = !ModuleManager.m4864a(djy);
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ModuleInfo extends BasicModuleInfo {

        /* renamed from: a */
        private Bundle f7691a;
        public final ModuleApkInfo moduleApk;

        public ModuleInfo(dka dka, ModuleApkInfo moduleApkInfo) {
            this(dka, moduleApkInfo, null);
        }

        public synchronized Bundle getMetadata(Context context) {
            Bundle bundle;
            int i;
            float f;
            String str;
            if (this.f7691a == null) {
                djz f2 = dfy.m8329a(context).mo8898f();
                int a = dlb.m8783a(f2, this.moduleId);
                brtm f3 = f2.mo9181f();
                int a2 = dll.m8799a(f3, dll.f13448d, new dlk(a, dll.f13445a));
                if (a2 < 0) {
                    a2 = (-a2) - 1;
                }
                int F = f3.mo69897F();
                dna dna = new dna();
                if (a2 < F) {
                    if (f3.mo69917a(dna, a2).mo9290S() == a) {
                        bundle = new Bundle();
                        while (true) {
                            int i2 = a2 + 1;
                            dna a3 = f3.mo69917a(dna, a2);
                            int __offset = a3.__offset(6);
                            int i3 = 0;
                            r7 = false;
                            boolean z = false;
                            if (__offset != 0) {
                                i = a3.f143329bb.getInt(__offset + a3.bb_pos);
                            } else {
                                i = 0;
                            }
                            if (i == 1) {
                                String P = a3.mo9295P();
                                int __offset2 = a3.__offset(8);
                                if (__offset2 != 0) {
                                    i3 = a3.f143329bb.getInt(__offset2 + a3.bb_pos);
                                }
                                bundle.putInt(P, i3);
                            } else if (i == 2) {
                                String P2 = a3.mo9295P();
                                int __offset3 = a3.__offset(10);
                                if (__offset3 != 0) {
                                    f = a3.f143329bb.getFloat(__offset3 + a3.bb_pos);
                                } else {
                                    f = 0.0f;
                                }
                                bundle.putFloat(P2, f);
                            } else if (i == 3) {
                                String P3 = a3.mo9295P();
                                int __offset4 = a3.__offset(12);
                                if (__offset4 != 0) {
                                    if (a3.f143329bb.get(__offset4 + a3.bb_pos) != 0) {
                                        z = true;
                                    }
                                }
                                bundle.putBoolean(P3, z);
                            } else if (i == 4) {
                                String P4 = a3.mo9295P();
                                int __offset5 = a3.__offset(14);
                                if (__offset5 != 0) {
                                    str = a3.__string(__offset5 + a3.bb_pos);
                                } else {
                                    str = null;
                                }
                                bundle.putCharSequence(P4, str);
                            } else if (i == 5) {
                                ByteBuffer __vector_as_bytebuffer = a3.__vector_as_bytebuffer(16, 1);
                                byte[] bArr = new byte[__vector_as_bytebuffer.remaining()];
                                __vector_as_bytebuffer.get(bArr);
                                bundle.putByteArray(a3.mo9295P(), bArr);
                            }
                            if (i2 < F && f3.mo69917a(dna, i2).mo9290S() == a) {
                                a2 = i2;
                            }
                        }
                        this.f7691a = bundle;
                    }
                }
                bundle = Bundle.EMPTY;
                this.f7691a = bundle;
            }
            return this.f7691a;
        }

        public ModuleInfo(dka dka, ModuleApkInfo moduleApkInfo, Bundle bundle) {
            super(dka.mo9184b(), dka.mo9186e());
            this.moduleApk = moduleApkInfo;
            this.f7691a = null;
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ModuleSetInfo {

        /* renamed from: a */
        private final bojy f7692a;
        public final String moduleSetId;
        @Deprecated
        public final int moduleSetVariant;
        @ChimeraApiVersion(added = 103)
        public final long moduleSetVersion;
        public final int moduleTargeting;

        public ModuleSetInfo(bojy bojy) {
            this.f7692a = bojy;
            this.moduleSetId = bojy.f133370b;
            this.moduleSetVariant = bojy.f133371c;
            this.moduleSetVersion = bojy.f133373e;
            this.moduleTargeting = bojy.f133372d;
        }

        public byte[] getProtoBytes() {
            return this.f7692a.mo73642k();
        }
    }

    public ModuleManager(Context context) {
        this.f7678a = context.getApplicationContext();
        this.f7679b = ModuleContext.getModuleContext(context);
    }

    /* renamed from: a */
    private final void m4863a() {
        try {
            djz f = dfy.m8329a(this.f7678a).mo8898f();
            bmzs.m108696a(this.f7679b);
            din e = this.f7679b.getModuleApk().mo8913e();
            int a = dik.m8576a(e.f13232b);
            if (a == 0) {
                a = 1;
            }
            int a2 = dll.m8799a(f, dll.f13446b, new dli(a - 1, ByteBuffer.wrap(e.f13233c.getBytes((Charset) brtm.UTF8_CHARSET.get()))));
            if (a2 >= 0) {
                this.f7681d = new ModuleApkInfo(f.mo9169a(a2));
                String moduleId = this.f7679b.getModuleId();
                if (moduleId != null) {
                    this.f7680c = new ModuleInfo(f.mo9172a(moduleId), this.f7681d);
                    return;
                }
                return;
            }
            throw new InvalidConfigException("missing ApkDescriptor");
        } catch (InvalidConfigException | NullPointerException e2) {
            bmzs.m108698a(false);
        }
    }

    public static ModuleManager get(Context context) {
        return new ModuleManager(context);
    }

    public static BasicModuleInfo getBasicModuleInfo(Context context) {
        String moduleId;
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext == null || (moduleId = moduleContext.getModuleId()) == null) {
            return null;
        }
        return new BasicModuleInfo(moduleId, moduleContext.getModuleVersion());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkt.a(djz, java.util.Collection):java.util.List
     arg types: [djz, java.util.List]
     candidates:
      dkt.a(djz, java.util.List):int
      dkt.a(djz, byte[]):int
      dkt.a(djz, java.util.Collection):java.util.List */
    public FeatureList fetchFeatures(String... strArr) {
        if (strArr.length == 0) {
            Log.e("ModuleManager", "Feature check call didn't receive any featureNames");
            return null;
        }
        try {
            return FeatureList.fromFeatures(dkt.m8754a(dfy.m8329a(this.f7678a).mo8898f(), (Collection) Arrays.asList(strArr)));
        } catch (InvalidConfigException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Unable to retrieve available features: ");
            sb.append(valueOf);
            Log.e("ModuleManager", sb.toString());
            return null;
        }
    }

    public Collection getAllModules() {
        List list;
        djz f = dfy.m8329a(this.f7678a).mo8898f();
        synchronized (f7675e) {
            dex dex = (dex) f7675e.get(f);
            if (dex != null) {
                list = dex.f12989b;
            } else {
                list = null;
            }
            if (list == null) {
                int b = f.mo9175b();
                ModuleApkInfo[] moduleApkInfoArr = new ModuleApkInfo[b];
                djy djy = new djy();
                for (int i = 0; i < b; i++) {
                    f.mo9170a(djy, i);
                    moduleApkInfoArr[i] = new ModuleApkInfo(djy);
                }
                int c = f.mo9177c();
                ArrayList arrayList = new ArrayList(c);
                dka dka = new dka();
                for (int i2 = 0; i2 < c; i2++) {
                    f.mo9171a(dka, i2);
                    arrayList.add(new ModuleInfo(dka, moduleApkInfoArr[dka.mo9183R()]));
                }
                list = Collections.unmodifiableList(arrayList);
                if (dex == null) {
                    dex = new dex();
                    f7675e.put(f, dex);
                }
                dex.f12989b = list;
            }
        }
        return list;
    }

    public Collection getAllModulesWithMetadata(String str) {
        ArrayList arrayList = new ArrayList();
        for (ModuleInfo moduleInfo : getAllModules()) {
            if (moduleInfo.getMetadata(this.f7678a).get(str) != null) {
                arrayList.add(moduleInfo);
            }
        }
        return arrayList;
    }

    @ChimeraApiVersion(added = 100)
    public int getApiVersion(String str) {
        ModuleContext moduleContext = this.f7679b;
        if (moduleContext != null) {
            return ((Integer) moduleContext.getFulfilledApis().getOrDefault(str, -1)).intValue();
        }
        Log.w("ModuleManager", "Unable to get current module's fulfilled APIs in ModuleManager created with non-module Context");
        return -2;
    }

    public ConfigInfo getCurrentConfig() {
        ConfigInfo configInfo;
        dfy a = dfy.m8329a(this.f7678a);
        djz f = a.mo8898f();
        dky c = a.mo8895c(f);
        synchronized (f7675e) {
            dex dex = (dex) f7675e.get(f);
            if (dex != null) {
                configInfo = dex.f12988a;
            } else {
                configInfo = null;
            }
            if (configInfo == null) {
                int b = f.mo9175b();
                SparseArray sparseArray = new SparseArray(b - 1);
                djy djy = new djy();
                int i = 0;
                for (int i2 = 0; i2 < b; i2++) {
                    f.mo9170a(djy, i2);
                    if (m4864a(djy)) {
                        sparseArray.put(i2, new ModuleApkInfo(djy));
                    }
                }
                int c2 = f.mo9177c();
                ArrayList arrayList = new ArrayList(c2);
                dka dka = new dka();
                for (int i3 = 0; i3 < c2; i3++) {
                    f.mo9171a(dka, i3);
                    ModuleApkInfo moduleApkInfo = (ModuleApkInfo) sparseArray.get(dka.mo9183R());
                    if (moduleApkInfo != null) {
                        arrayList.add(new ModuleInfo(dka, moduleApkInfo));
                    }
                }
                ArrayList arrayList2 = new ArrayList(c.size());
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new ModuleSetInfo((bojy) it.next()));
                }
                if (f.mo9179d() > 0) {
                    i = 1;
                }
                ConfigInfo configInfo2 = new ConfigInfo(arrayList2, arrayList, i);
                if (dex == null) {
                    dex = new dex();
                    f7675e.put(f, dex);
                }
                dex.f12988a = configInfo2;
                configInfo = configInfo2;
            }
        }
        return configInfo;
    }

    public ModuleInfo getCurrentModule() {
        ModuleInfo moduleInfo;
        ModuleContext moduleContext = this.f7679b;
        if (moduleContext == null || moduleContext.getModuleId() == null) {
            throw new IllegalStateException("Unable to get current module info in ModuleManager created with non-module Context");
        }
        synchronized (this) {
            if (this.f7680c == null) {
                m4863a();
            }
            moduleInfo = this.f7680c;
        }
        return moduleInfo;
    }

    public ModuleApkInfo getCurrentModuleApk() {
        ModuleApkInfo moduleApkInfo;
        if (this.f7679b != null) {
            synchronized (this) {
                if (this.f7681d == null) {
                    m4863a();
                }
                moduleApkInfo = this.f7681d;
            }
            return moduleApkInfo;
        }
        throw new IllegalStateException("Unable to get current module APK info in ModuleManager created with non-module Context");
    }

    public Uri getModuleProviderUri() {
        Uri build;
        if (f7677g != null) {
            return f7677g;
        }
        synchronized (f7676f) {
            String str = null;
            try {
                djz f = dfy.m8329a(this.f7678a).mo8898f();
                Uri.Builder scheme = new Uri.Builder().scheme("content");
                int __offset = f.__offset(18);
                if (__offset != 0) {
                    str = f.__string(__offset + f.bb_pos);
                }
                build = scheme.authority(str).path("features").build();
                f7677g = build;
            } catch (InvalidConfigException e) {
                Log.e("ModuleManager", "Exception retrieving installed module configuration");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    public Map getThirdPartyLicenses() {
        String n;
        djz f = dfy.m8329a(this.f7678a).mo8898f();
        Map a = adyi.m51410a();
        int b = f.mo9175b();
        djy djy = new djy();
        for (int i = 0; i < b; i++) {
            f.mo9170a(djy, i);
            dht a2 = dht.m8526a(this.f7678a, djy);
            if (!(a2 == null || (n = a2.mo9030n()) == null)) {
                a.put(new ModuleApkInfo(djy), n);
            }
        }
        return a;
    }

    public boolean requestFeatures(FeatureRequest featureRequest) {
        String moduleId;
        ModuleContext moduleContext = this.f7679b;
        if (moduleContext == null || (moduleId = moduleContext.getModuleId()) == null) {
            throw new IllegalStateException("Unable to get current module ID");
        }
        Uri moduleProviderUri = getModuleProviderUri();
        if (moduleProviderUri == null) {
            Log.e("ModuleManager", "Feature request call couldn't determine a suitable uri");
            return false;
        }
        Bundle bundle = null;
        try {
            bundle = this.f7678a.getContentResolver().call(moduleProviderUri, "feature_request", (String) null, featureRequest.toContractBundle(moduleId));
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Feature request failed: ");
            sb.append(valueOf);
            Log.w("ModuleManager", sb.toString());
        }
        if (bundle == null || !bundle.getBoolean("result")) {
            return false;
        }
        return true;
    }

    @ChimeraApiVersion(added = 104)
    public int checkFeaturesAreAvailable(FeatureCheck featureCheck) {
        if (featureCheck.f7682a.isEmpty()) {
            return 0;
        }
        try {
            return dkt.m8751a(dfy.m8329a(this.f7678a).mo8898f(), featureCheck.getFeatureDescriptors());
        } catch (InvalidConfigException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Unable to retrieve available features: ");
            sb.append(valueOf);
            Log.e("ModuleManager", sb.toString());
            return 3;
        }
    }

    @Deprecated
    public int checkFeaturesAreAvailable(FeatureList featureList) {
        byte[] protoBytes = featureList.getProtoBytes();
        if (protoBytes == null || protoBytes.length == 0) {
            return 0;
        }
        try {
            return dkt.m8752a(dfy.m8329a(this.f7678a).mo8898f(), protoBytes);
        } catch (InvalidConfigException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Unable to retrieve available features: ");
            sb.append(valueOf);
            Log.e("ModuleManager", sb.toString());
            return 3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m4864a(djy djy) {
        return djy.mo9160k() == 2;
    }
}
