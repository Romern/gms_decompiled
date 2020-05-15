package p000;

import android.net.Uri;
import com.google.android.gms.mdd.MddFile;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.autofill.detection.p098ml.Model;
import com.google.autofill.detection.p098ml.ModelConfig;
import com.google.autofill.detection.p098ml.NeuralNetwork;
import com.google.autofill.detection.p098ml.RuntimeConfiguration;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.HashSet;

/* renamed from: kym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kym {

    /* renamed from: a */
    public static final srn f25418a = srn.m36124a();

    /* renamed from: b */
    public static final Object f25419b = new Object();

    /* renamed from: c */
    public static MappedByteBuffer f25420c = null;

    /* renamed from: d */
    public static MddFile f25421d = null;

    /* renamed from: e */
    public static MddFile f25422e = null;

    /* renamed from: f */
    public final afkl f25423f;

    /* renamed from: g */
    public final befa f25424g;

    /* renamed from: h */
    public final bngx f25425h;

    @Deprecated
    public kym(afkl afkl, befa befa) {
        this.f25423f = afkl;
        this.f25424g = befa;
        this.f25425h = bngx.m109376e();
    }

    /* renamed from: a */
    private final bmxv m18793a() {
        if (cciw.m129954c()) {
            RuntimeConfiguration.setAllowProximityDecoratorCaching(cciw.m129954c());
            RuntimeConfiguration.setDisableProximityDecoratorStreaming(cciw.f179109a.mo6606a().mo76076i());
            RuntimeConfiguration.setAllowProximityDecoratorLevelSwapping(cciw.f179109a.mo6606a().mo76071d());
            RuntimeConfiguration.setRandomizeModelSignalOrder(cciw.f179109a.mo6606a().mo76085r());
            RuntimeConfiguration.setEnableMoreEfficientProximityDecoratorGenerate(cciw.f179109a.mo6606a().mo76078k());
            RuntimeConfiguration.setOptimizeRegexBuilderProducers(cciw.f179109a.mo6606a().mo76081n());
            RuntimeConfiguration.setAllowRegexCountingSignalEarlyQuitting(cciw.f179109a.mo6606a().mo76072e());
        }
        bmxv bmxv = bmvz.f131120a;
        bmxv bmxv2 = bmvz.f131120a;
        HashSet<kyo> hashSet = new HashSet();
        bnre i = this.f25425h.listIterator();
        while (i.hasNext()) {
            kyo kyo = (kyo) i.next();
            kyn a = kyo.mo14939a();
            if (!bmxv.mo66813a() && a.mo14933a().mo66813a()) {
                bmxv = a.mo14933a();
                hashSet.add(kyo);
            }
            if (!bmxv2.mo66813a() && a.mo14934b().mo66813a()) {
                bmxv2 = a.mo14934b();
                hashSet.add(kyo);
            }
            if (bmxv.mo66813a() && bmxv2.mo66813a()) {
                try {
                    return bmxv.m108566b(new Model((ModelConfig) bmxv.mo66814b(), (NeuralNetwork) bmxv2.mo66814b()));
                } catch (IllegalArgumentException e) {
                    bnsl bnsl = (bnsl) f25418a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("kym", "a", 148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Failed to instantiate model.");
                    for (kyo kyo2 : hashSet) {
                        kyo2.mo14940b();
                    }
                    return bmvz.f131120a;
                }
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: b */
    private final bmxv m18797b(MddFile mddFile) {
        if (mddFile == null) {
            return bmvz.f131120a;
        }
        try {
            return bmxv.m108566b(ModelConfig.parseFrom((byte[]) this.f25424g.mo60643a(Uri.parse(mddFile.f79970b), behp.m95056a(), new beer[0])));
        } catch (FileNotFoundException e) {
            bnsl bnsl = (bnsl) f25418a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("kym", "b", 243, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to find cached MDD file for model config.");
            return bmvz.f131120a;
        } catch (IOException e2) {
            bnsl bnsl2 = (bnsl) f25418a.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68432a("kym", "b", 246, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Exception while executing mdd read task for model config");
            return bmvz.f131120a;
        } catch (blma | blmh e3) {
            bnsl bnsl3 = (bnsl) f25418a.mo68387b();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("kym", "b", 250, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Exception while de-serializing model config");
            return bmvz.f131120a;
        }
    }

    public kym(Iterable iterable) {
        this.f25425h = bngx.m109355a(iterable);
        this.f25423f = null;
        this.f25424g = null;
    }

    /* renamed from: a */
    private final bmxv m18794a(MddFile mddFile) {
        synchronized (f25419b) {
            if (mddFile != null) {
                MappedByteBuffer mappedByteBuffer = f25420c;
                if (mappedByteBuffer == null) {
                    try {
                        MappedByteBuffer mappedByteBuffer2 = (MappedByteBuffer) this.f25424g.mo60643a(Uri.parse(mddFile.f79970b), new kyl(), new beer[0]);
                        f25420c = mappedByteBuffer2;
                        bmxv a = m18795a(mappedByteBuffer2);
                        return a;
                    } catch (FileNotFoundException e) {
                        bnsl bnsl = (bnsl) f25418a.mo68388c();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("kym", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Failed to find cached MDD file for neural network.");
                        return bmvz.f131120a;
                    } catch (IOException e2) {
                        bnsl bnsl2 = (bnsl) f25418a.mo68387b();
                        bnsl2.mo68437a(e2);
                        bnsl2.mo68432a("kym", "a", 227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("Exception while executing mdd read task for neural network");
                        return bmvz.f131120a;
                    }
                } else {
                    bmxv a2 = m18795a(mappedByteBuffer);
                    return a2;
                }
            } else {
                bmvz bmvz = bmvz.f131120a;
                return bmvz;
            }
        }
    }

    /* renamed from: a */
    public static bmxv m18795a(ByteBuffer byteBuffer) {
        try {
            return bmxv.m108566b(NeuralNetwork.obsoleteCreateFromFlatBuffer(byteBuffer));
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f25418a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("kym", "a", 319, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Exception while de-serializing neural network");
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m18796a(Exception exc) {
        bnsl bnsl = (bnsl) f25418a.mo68387b();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("kym", "a", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Exception while executing mdd read task for ml model");
    }
}
