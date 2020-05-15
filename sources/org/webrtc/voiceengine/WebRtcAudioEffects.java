package org.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import com.felicanetworks.mfc.BuildConfig;
import java.util.UUID;
import org.webrtc.Logging;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;

    /* renamed from: ns */
    private NoiseSuppressor f192128ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    private WebRtcAudioEffects() {
        String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        Logging.m151178a(TAG, valueOf.length() == 0 ? new String("ctor") : "ctor".concat(valueOf));
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z = false;
        if (isAcousticEchoCancelerSupported() && !WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() && !isAcousticEchoCancelerBlacklisted() && !isAcousticEchoCancelerExcludedByUUID()) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("canUseAcousticEchoCanceler: ");
        sb.append(z);
        Logging.m151178a(TAG, sb.toString());
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z = false;
        if (isNoiseSuppressorSupported() && !WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() && !isNoiseSuppressorBlacklisted() && !isNoiseSuppressorExcludedByUUID()) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("canUseNoiseSuppressor: ");
        sb.append(z);
        Logging.m151178a(TAG, sb.toString());
        return z;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        int i = Build.VERSION.SDK_INT;
        if (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) {
            return true;
        }
        return AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported();
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForAecUsage().contains(Build.MODEL);
        if (contains) {
            Logging.m151181c(TAG, String.valueOf(Build.MODEL).concat(" is blacklisted for HW AEC usage!"));
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        int i = Build.VERSION.SDK_INT;
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        int i = Build.VERSION.SDK_INT;
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects != null) {
            for (AudioEffect.Descriptor descriptor : availableEffects) {
                if (descriptor.type.equals(uuid)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForNsUsage().contains(Build.MODEL);
        if (contains) {
            Logging.m151181c(TAG, String.valueOf(Build.MODEL).concat(" is blacklisted for HW NS usage!"));
        }
        return contains;
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        int i = Build.VERSION.SDK_INT;
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        int i = Build.VERSION.SDK_INT;
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(32);
        sb.append("enable(audioSession=");
        sb.append(i);
        sb.append(")");
        Logging.m151178a(TAG, sb.toString());
        boolean z4 = true;
        if (this.aec == null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.f192128ns == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        String str4 = "disabled";
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                if (!this.shouldEnableAec || !canUseAcousticEchoCanceler()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (this.aec.setEnabled(z3) != 0) {
                    Logging.m151180b(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                if (!enabled) {
                    str2 = str4;
                } else {
                    str2 = "enabled";
                }
                if (!this.aec.getEnabled()) {
                    str3 = str4;
                } else {
                    str3 = "enabled";
                }
                StringBuilder sb2 = new StringBuilder(str2.length() + 51 + str3.length());
                sb2.append("AcousticEchoCanceler: was ");
                sb2.append(str2);
                sb2.append(", enable: ");
                sb2.append(z3);
                sb2.append(", is now: ");
                sb2.append(str3);
                Logging.m151178a(TAG, sb2.toString());
            } else {
                Logging.m151180b(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i);
            this.f192128ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                if (!this.shouldEnableNs || !canUseNoiseSuppressor()) {
                    z4 = false;
                }
                if (this.f192128ns.setEnabled(z4) != 0) {
                    Logging.m151180b(TAG, "Failed to set the NoiseSuppressor state");
                }
                if (!enabled2) {
                    str = str4;
                } else {
                    str = "enabled";
                }
                if (this.f192128ns.getEnabled()) {
                    str4 = "enabled";
                }
                StringBuilder sb3 = new StringBuilder(str.length() + 46 + str4.length());
                sb3.append("NoiseSuppressor: was ");
                sb3.append(str);
                sb3.append(", enable: ");
                sb3.append(z4);
                sb3.append(", is now: ");
                sb3.append(str4);
                Logging.m151178a(TAG, sb3.toString());
                return;
            }
            Logging.m151180b(TAG, "Failed to create the NoiseSuppressor instance");
        }
    }

    public void release() {
        Logging.m151178a(TAG, BuildConfig.BUILD_TYPE);
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.f192128ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f192128ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        StringBuilder sb = new StringBuilder(13);
        sb.append("setAEC(");
        sb.append(z);
        sb.append(")");
        Logging.m151178a(TAG, sb.toString());
        if (!canUseAcousticEchoCanceler()) {
            Logging.m151181c(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        } else {
            Logging.m151180b(TAG, "Platform AEC state can't be modified while recording");
            return false;
        }
    }

    public boolean setNS(boolean z) {
        StringBuilder sb = new StringBuilder(12);
        sb.append("setNS(");
        sb.append(z);
        sb.append(")");
        Logging.m151178a(TAG, sb.toString());
        if (!canUseNoiseSuppressor()) {
            Logging.m151181c(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.f192128ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        } else {
            Logging.m151180b(TAG, "Platform NS state can't be modified while recording");
            return false;
        }
    }
}
