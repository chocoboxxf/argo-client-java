

# IoK8sApiCoreV1PersistentVolumeClaimSpec

PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | **List&lt;String&gt;** | AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1 |  [optional]
**dataSource** | [**IoK8sApiCoreV1TypedLocalObjectReference**](IoK8sApiCoreV1TypedLocalObjectReference.md) |  |  [optional]
**resources** | [**IoK8sApiCoreV1ResourceRequirements**](IoK8sApiCoreV1ResourceRequirements.md) |  |  [optional]
**selector** | [**IoK8sApimachineryPkgApisMetaV1LabelSelector**](IoK8sApimachineryPkgApisMetaV1LabelSelector.md) |  |  [optional]
**storageClassName** | **String** | Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1 |  [optional]
**volumeMode** | **String** | volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. This is a beta feature. |  [optional]
**volumeName** | **String** | VolumeName is the binding reference to the PersistentVolume backing this claim. |  [optional]


