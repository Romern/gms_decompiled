package com.google.android.gms.chimera;

import com.google.android.chimera.DeviceAdminReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsIntentOperationService extends qlb {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ChimeraService extends qla {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class GmsExternalChimeraReceiver extends dhn {
        public GmsExternalChimeraReceiver() {
            super(true, null, qkw.m32313b());
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class GmsExternalReceiver extends qkv {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PersistentDownloadChimeraReceiver extends dhn {
        public PersistentDownloadChimeraReceiver() {
            super(false, new String[]{"android.intent.action.DOWNLOAD_COMPLETE"}, qkw.m32313b());
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PersistentDownloadReceiver extends qkv {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PersistentInternalChimeraReceiver extends dhn {
        public PersistentInternalChimeraReceiver() {
            super(false, null, qkw.m32313b());
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PersistentInternalReceiver extends qkv {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PersistentTrustedChimeraReceiver extends dhn {
        public PersistentTrustedChimeraReceiver() {
            super(false, new String[]{"android.intent.action.MY_PACKAGE_REPLACED", "android.intent.action.PACKAGE_ADDED", "android.intent.action.PACKAGE_CHANGED", "android.intent.action.PACKAGE_DATA_CLEARED", "android.intent.action.PACKAGE_FULLY_REMOVED", "android.intent.action.PACKAGE_REMOVED", "android.intent.action.PACKAGE_REPLACED", "android.accounts.LOGIN_ACCOUNTS_CHANGED", DeviceAdminReceiver.ACTION_PASSWORD_CHANGED, "android.app.action.DEVICE_OWNER_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED", "android.app.action.STATSD_STARTED", "android.app.action.SYSTEM_UPDATE_POLICY_CHANGED", "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED", "android.bluetooth.adapter.action.STATE_CHANGED", "android.bluetooth.device.action.ACL_CONNECTED", "android.bluetooth.device.action.ACL_DISCONNECTED", "android.bluetooth.device.action.ALIAS_CHANGED", "android.bluetooth.device.action.BATTERY_LEVEL_CHANGED", "android.bluetooth.device.action.BOND_STATE_CHANGED", "android.bluetooth.device.action.UUID", "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", "android.intent.action.ACTION_POWER_CONNECTED", "android.intent.action.ACTION_POWER_DISCONNECTED", "android.intent.action.BOOT_COMPLETED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DROPBOX_ENTRY_ADDED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.LOCKED_BOOT_COMPLETED", "android.intent.action.NEW_OUTGOING_CALL", "android.intent.action.SIM_STATE_CHANGED", "android.intent.action.TIME_SET", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.USER_INITIALIZE", "android.intent.action.USER_PRESENT", "android.location.MODE_CHANGED", "android.location.PROVIDERS_CHANGED", "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED", "android.net.conn.NETWORK_CONDITIONS_MEASURED", "android.net.wifi.WIFI_AP_STATE_CHANGED", "android.os.UpdateLock.UPDATE_LOCK_CHANGED", "android.security.action.RECOVERABLE_KEYSTORE_SNAPSHOT"}, qkw.m32313b());
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class PersistentTrustedReceiver extends qkv {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SecretCodeReceiver extends qkv {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SecreteCodeChimeraReceiver extends dhn {
        public SecreteCodeChimeraReceiver() {
            super(false, new String[]{"android.provider.Telephony.SECRET_CODE"}, qkw.m32313b());
        }
    }
}
