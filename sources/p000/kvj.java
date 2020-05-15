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
import java.nio.MappedByteBuffer;
import java.util.HashSet;

/* renamed from: kvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kvj implements cayy {

    /* renamed from: a */
    private final cijl f25179a;

    public kvj(cijl cijl) {
        this.f25179a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Object obj;
        bmxv bmxv;
        bmxv bmxv2;
        kym kym = (kym) this.f25179a.mo6445a();
        if (!lrb.m19569b()) {
            obj = bmvz.f131120a;
        } else if (!lrb.m19569b()) {
            obj = bmvz.f131120a;
        } else if (!kym.f25425h.isEmpty()) {
            if (cciw.m129954c()) {
                RuntimeConfiguration.setAllowProximityDecoratorCaching(cciw.m129954c());
                RuntimeConfiguration.setDisableProximityDecoratorStreaming(cciw.f179109a.mo6606a().mo76076i());
                RuntimeConfiguration.setAllowProximityDecoratorLevelSwapping(cciw.f179109a.mo6606a().mo76071d());
                RuntimeConfiguration.setRandomizeModelSignalOrder(cciw.f179109a.mo6606a().mo76085r());
                RuntimeConfiguration.setEnableMoreEfficientProximityDecoratorGenerate(cciw.f179109a.mo6606a().mo76078k());
                RuntimeConfiguration.setOptimizeRegexBuilderProducers(cciw.f179109a.mo6606a().mo76081n());
                RuntimeConfiguration.setAllowRegexCountingSignalEarlyQuitting(cciw.f179109a.mo6606a().mo76072e());
            }
            bmxv bmxv3 = bmvz.f131120a;
            bmxv bmxv4 = bmvz.f131120a;
            HashSet<kyo> hashSet = new HashSet();
            bnre i = kym.f25425h.listIterator();
            while (true) {
                if (!i.hasNext()) {
                    obj = bmvz.f131120a;
                    break;
                }
                kyo kyo = (kyo) i.next();
                kyn a = kyo.mo14939a();
                if (!bmxv3.mo66813a() && a.mo14933a().mo66813a()) {
                    bmxv3 = a.mo14933a();
                    hashSet.add(kyo);
                }
                if (!bmxv4.mo66813a() && a.mo14934b().mo66813a()) {
                    bmxv4 = a.mo14934b();
                    hashSet.add(kyo);
                }
                if (bmxv3.mo66813a() && bmxv4.mo66813a()) {
                    try {
                        obj = bmxv.m108566b(new Model((ModelConfig) bmxv3.mo66814b(), (NeuralNetwork) bmxv4.mo66814b()));
                        break;
                    } catch (IllegalArgumentException e) {
                        bnsl bnsl = (bnsl) kym.f25418a.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("kym", "a", 148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Failed to instantiate model.");
                        for (kyo kyo2 : hashSet) {
                            kyo2.mo14940b();
                        }
                        obj = bmvz.f131120a;
                    }
                }
            }
        } else {
            aucb a2 = kym.f25423f.mo34919a("autofill-field-detection-model", "com.google.android.gms");
            a2.mo50373a(new kyj(a2));
            a2.mo50372a(kyk.f25416a);
            synchronized (kym.f25419b) {
                MddFile mddFile = kym.f25421d;
                synchronized (kym.f25419b) {
                    if (mddFile != null) {
                        MappedByteBuffer mappedByteBuffer = kym.f25420c;
                        if (mappedByteBuffer == null) {
                            try {
                                MappedByteBuffer mappedByteBuffer2 = (MappedByteBuffer) kym.f25424g.mo60643a(Uri.parse(mddFile.f79970b), new kyl(), new beer[0]);
                                kym.f25420c = mappedByteBuffer2;
                                bmxv = kym.m18795a(mappedByteBuffer2);
                            } catch (FileNotFoundException e2) {
                                bnsl bnsl2 = (bnsl) kym.f25418a.mo68388c();
                                bnsl2.mo68437a(e2);
                                bnsl2.mo68432a("kym", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("Failed to find cached MDD file for neural network.");
                                bmxv = bmvz.f131120a;
                            } catch (IOException e3) {
                                bnsl bnsl3 = (bnsl) kym.f25418a.mo68387b();
                                bnsl3.mo68437a(e3);
                                bnsl3.mo68432a("kym", "a", 227, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68405a("Exception while executing mdd read task for neural network");
                                bmxv = bmvz.f131120a;
                            }
                        } else {
                            bmxv = kym.m18795a(mappedByteBuffer);
                        }
                    } else {
                        bmxv = bmvz.f131120a;
                    }
                }
                MddFile mddFile2 = kym.f25422e;
                if (mddFile2 != null) {
                    try {
                        bmxv2 = bmxv.m108566b(ModelConfig.parseFrom((byte[]) kym.f25424g.mo60643a(Uri.parse(mddFile2.f79970b), behp.m95056a(), new beer[0])));
                    } catch (FileNotFoundException e4) {
                        bnsl bnsl4 = (bnsl) kym.f25418a.mo68388c();
                        bnsl4.mo68437a(e4);
                        bnsl4.mo68432a("kym", "b", 243, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("Failed to find cached MDD file for model config.");
                        bmxv2 = bmvz.f131120a;
                    } catch (IOException e5) {
                        bnsl bnsl5 = (bnsl) kym.f25418a.mo68387b();
                        bnsl5.mo68437a(e5);
                        bnsl5.mo68432a("kym", "b", 246, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68405a("Exception while executing mdd read task for model config");
                        bmxv2 = bmvz.f131120a;
                    } catch (blma | blmh e6) {
                        bnsl bnsl6 = (bnsl) kym.f25418a.mo68387b();
                        bnsl6.mo68437a(e6);
                        bnsl6.mo68432a("kym", "b", 250, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68405a("Exception while de-serializing model config");
                        bmxv2 = bmvz.f131120a;
                    }
                } else {
                    bmxv2 = bmvz.f131120a;
                }
            }
            obj = (bmxv.mo66813a() && bmxv2.mo66813a()) ? bmxv.m108566b(Model.obsoleteCreate((ModelConfig) bmxv2.mo66814b(), (NeuralNetwork) bmxv.mo66814b())) : bmvz.f131120a;
        }
        cazf.m127593a(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }
}
